package com.sahil.lovable_clone.service.impl;

import com.sahil.lovable_clone.dto.project.ProjectRequest;
import com.sahil.lovable_clone.dto.project.ProjectResponse;
import com.sahil.lovable_clone.dto.project.ProjectSummaryResponse;
import com.sahil.lovable_clone.error.ResourceNotFoundException;
import com.sahil.lovable_clone.mapper.ProjectMapper;
import com.sahil.lovable_clone.entity.Project;
import com.sahil.lovable_clone.entity.ProjectMember;
import com.sahil.lovable_clone.entity.ProjectMemberId;
import com.sahil.lovable_clone.entity.User;
import com.sahil.lovable_clone.enums.ProjectRole;

import com.sahil.lovable_clone.repository.ProjectMemberRepository;
import com.sahil.lovable_clone.repository.ProjectRepository;
import com.sahil.lovable_clone.repository.UserRepository;
import com.sahil.lovable_clone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;
    ProjectMemberRepository projectMemberRepository;
    //AuthUtil authUtil;

    @Override
    public ProjectResponse createProject(ProjectRequest request) {
        Long userId = 1L; //authUtil.getCurrentUserId();
        User owner = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User", userId.toString())
        );
//        User owner = userRepository.getReferenceById(userId);

        // Creating a project in project table
        Project project = Project.builder()
                .name(request.name())
                .isPublic(false)
                .build();
        project = projectRepository.save(project);

        //Creating a record in Project Member as a OWNER
        ProjectMemberId projectMemberId = new ProjectMemberId(project.getId(), owner.getId());
        ProjectMember projectMember = ProjectMember.builder()
                .id(projectMemberId)
                .projectRole(ProjectRole.OWNER)
                .user(owner)
                .acceptedAt(Instant.now())
                .invitedAt(Instant.now())
                .project(project)
                .build();
        projectMemberRepository.save(projectMember);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects() {
        Long userId = 1L;
        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id) {
        Long userId = 1L;
        Project project = getAccessibleProjectById(id, userId);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request) {
        Long userId = 1L;
        Project project = getAccessibleProjectById(id, userId);

        project.setName(request.name());
        project = projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public void softDelete(Long id) {
        Long userId = 1L;
        Project project = getAccessibleProjectById(id, userId);


        project.setDeletedAt(Instant.now());
        projectRepository.save(project);
    }

    ///  INTERNAL FUNCTIONS
//
    public Project getAccessibleProjectById(Long projectId, Long userId) {
       return projectRepository.findAccessibleProjectById(projectId, userId)
               .orElseThrow(() -> new ResourceNotFoundException("Project",projectId.toString()));
    }
}

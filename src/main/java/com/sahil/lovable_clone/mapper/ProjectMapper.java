package com.sahil.lovable_clone.mapper;

import com.sahil.lovable_clone.dto.project.ProjectResponse;
import com.sahil.lovable_clone.dto.project.ProjectSummaryResponse;
import com.sahil.lovable_clone.entity.Project;
import com.sahil.lovable_clone.dto.project.ProjectResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);
    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);
    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}

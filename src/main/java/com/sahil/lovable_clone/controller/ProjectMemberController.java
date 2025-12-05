package com.sahil.lovable_clone.controller;

import com.sahil.lovable_clone.dto.member.InviteMemberRequest;
import com.sahil.lovable_clone.dto.member.MemberResponse;
import com.sahil.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.sahil.lovable_clone.dto.project.ProjectRequest;
import com.sahil.lovable_clone.dto.project.ProjectResponse;
import com.sahil.lovable_clone.dto.project.ProjectSummaryResponse;
import com.sahil.lovable_clone.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController{

    private final ProjectMemberService projectMemberService;
    @GetMapping()
    public ResponseEntity<MemberResponse> getProjectMembers(@PathVariable Long projectId) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId,userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(@PathVariable Long projectId,
                                                         @RequestBody InviteMemberRequest request) {
        Long userId = 1L;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(projectMemberService.inviteMember(projectId,request,userId));
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(@PathVariable Long memberId,
                                                           @PathVariable Long projectId,
                                                         @RequestBody UpdateMemberRoleRequest request) {
        Long userId = 1L;
        return ResponseEntity
                .ok(projectMemberService.updateMemberRole(memberId,projectId,request,userId));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<ProjectResponse> deleteProjectMember(@PathVariable Long memberId,
                                                               @PathVariable Long projectId,
                                                         @RequestBody ProjectRequest request) {
        Long userId = 1L;
        projectMemberService.deleteProjectMember(memberId,projectId,userId);
        return ResponseEntity.noContent().build();

    }
}

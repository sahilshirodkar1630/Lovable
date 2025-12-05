package com.sahil.lovable_clone.service;

import com.sahil.lovable_clone.dto.member.InviteMemberRequest;
import com.sahil.lovable_clone.dto.member.MemberResponse;
import com.sahil.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.sahil.lovable_clone.dto.project.ProjectRequest;

public interface ProjectMemberService {
    MemberResponse getProjectMembers(Long projectId, Long userId);
    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);
    MemberResponse updateMemberRole(Long memberId, Long projectId, UpdateMemberRoleRequest request, Long userId);
    void deleteProjectMember(Long memberId, Long projectId, Long userId);
}

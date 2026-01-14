package com.sahil.lovable_clone.service;

import com.sahil.lovable_clone.dto.member.InviteMemberRequest;
import com.sahil.lovable_clone.dto.member.MemberResponse;
import com.sahil.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.sahil.lovable_clone.dto.project.ProjectRequest;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

    void removeProjectMember(Long projectId, Long memberId);
}


package com.sahil.lovable_clone.dto.member;

import com.sahil.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}

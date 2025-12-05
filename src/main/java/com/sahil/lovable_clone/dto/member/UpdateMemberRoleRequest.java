package com.sahil.lovable_clone.dto.member;

import com.sahil.lovable_clone.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}

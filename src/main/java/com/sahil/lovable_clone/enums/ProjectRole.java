package com.sahil.lovable_clone.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
@Getter
public enum ProjectRole {
    EDITOR(ProjectPermission.VIEW,ProjectPermission.VIEW_MEMBERS,ProjectPermission.EDIT,ProjectPermission.DELETE),
    VIEWER(ProjectPermission.VIEW,ProjectPermission.VIEW_MEMBERS),
    OWNER(ProjectPermission.VIEW,
            ProjectPermission.EDIT,
            ProjectPermission.DELETE,
            ProjectPermission.VIEW_MEMBERS,
            ProjectPermission.MANAGE_MEMBERS);

    ProjectRole(ProjectPermission... permissions){
        this.permissions = Set.of(permissions);
    }

    private final Set<ProjectPermission> permissions;
}

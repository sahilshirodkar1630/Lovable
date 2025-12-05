package com.sahil.lovable_clone.entity;

import com.sahil.lovable_clone.enums.ProjectRole;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    ProjectMemberId projectMemberId;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;

    Instant acceptedAt;

}

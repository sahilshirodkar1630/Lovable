package com.sahil.lovable_clone.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {

    Long id;

    Project project;

    String path;

    String minioObjectKey;

    User createdBy;

    User updatedBy;

    Instant createdAt;

    Instant updatedAt;




}

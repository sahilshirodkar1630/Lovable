package com.sahil.lovable_clone.entity;

import com.sahil.lovable_clone.enums.PreviewStatus;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview  {

    Long id;

    Project project;

    String namespace;

    String podName;
    String previewUrl;
    String Status;

    PreviewStatus previewStatus;

    Instant startedAt;
    Instant terminatedAt;

    Instant createdAt;

}

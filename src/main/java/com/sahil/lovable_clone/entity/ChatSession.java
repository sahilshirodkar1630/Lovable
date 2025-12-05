package com.sahil.lovable_clone.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {

    Project project;

    User user;

    String title;

    Instant createdAt;
    Instant updatedAt;

    Instant deletedAt;

}

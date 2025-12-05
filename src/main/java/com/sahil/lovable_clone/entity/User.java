package com.sahil.lovable_clone.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE) // used to set access level at entity level
public class User {
    //camelCase for entities
    //snakecase or sql tables
     Long id;

     String email;

     String passwordHash;
     String name;

     String avatarUrl;

     Instant createdAt;
     Instant updatedAt;

     Instant deletedAt; // soft delete user

}

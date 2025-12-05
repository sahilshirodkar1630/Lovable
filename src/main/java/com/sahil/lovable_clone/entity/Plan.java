package com.sahil.lovable_clone.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    Long id;
    String name;
    String stripePriceId; //
    Integer maxProjects; // how projects we can support
    Integer maxTokensPerDay; // defining how many tokens per days are allowed based on plan
    Integer maxPreviews; // defining how many tokens per days are allowed based on plan
    Boolean unlimitedAi; // unlimited access to LLM, ignore maxTokensPerDay if true
    Boolean active;

}

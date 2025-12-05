package com.sahil.lovable_clone.dto.subscription;

public record PlanResponse(
        Long id,
        String name,
        Integer maxProjects, // how projects we can support
        Integer maxTokensPerDay, // defining how many tokens per days are allowed based on plan
        Integer maxPreviews, // defining how many tokens per days are allowed based on plan
        Boolean unlimitedAi, // unlimited access to LLM, ignore maxTokensPerDay if true
        String price
) {
}

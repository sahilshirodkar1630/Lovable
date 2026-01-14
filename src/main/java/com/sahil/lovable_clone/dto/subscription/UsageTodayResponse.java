package com.sahil.lovable_clone.dto.subscription;

public record UsageTodayResponse(
        Integer  tokensUsed,
        Integer  tokenLimit,
        Integer  previewsRunning,
        Integer  previewsLimit
) {
}

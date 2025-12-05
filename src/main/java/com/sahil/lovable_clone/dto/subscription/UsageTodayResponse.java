package com.sahil.lovable_clone.dto.subscription;

public record UsageTodayResponse(
        int tokensUsed,
        int tokenLimit,
        int previewsRunning,
        int previewsLimit
) {
}

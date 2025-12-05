package com.sahil.lovable_clone.service;

import com.sahil.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.sahil.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);
    PlanLimitsResponse getCurrentSubscriptionsLimitsOfUser(Long userId);
}

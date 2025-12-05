package com.sahil.lovable_clone.service;

import com.sahil.lovable_clone.dto.subscription.CheckoutRequest;
import com.sahil.lovable_clone.dto.subscription.CheckoutResponse;
import com.sahil.lovable_clone.dto.subscription.PortalResponse;
import com.sahil.lovable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);
    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);
    PortalResponse openCustomerPortal(Long userId);
}

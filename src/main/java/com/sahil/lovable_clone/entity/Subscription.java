package com.sahil.lovable_clone.entity;

import com.sahil.lovable_clone.enums.SubscriptionStatus;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    Long id;

    User userId;

    Plan planId;

    String stripeCustomerId; //
    String stripeSubscriptionId; //

    SubscriptionStatus status;

    Instant currentPeriodStart; // when the subscription period starts
    Instant currentPeriodEnd; //when the subscription period ends

    Boolean cancelAtPeriodEnd = false; // if the user ants to cancel subscription at period ends he can

    Instant createdAt;
    Instant updatedAt;
}

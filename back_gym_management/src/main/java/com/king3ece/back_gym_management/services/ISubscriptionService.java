package com.king3ece.back_gym_management.services;

import com.king3ece.back_gym_management.models.Subscription;

public interface ISubscriptionService {
    Subscription addSubscription(Subscription subscription);

    String deleteSubscription(Long id);
}

package com.king3ece.back_gym_management.services;

import com.king3ece.back_gym_management.models.Subscription;
import com.king3ece.back_gym_management.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    public String deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
        return "Subscription revoked";
    }
}

package io.swagger.service;

import io.swagger.infrastructure.SubscriptionRepository;
import io.swagger.model.SubscriptionRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSubscriptionService implements SubscriptionService{

    SubscriptionRepository subscriptionRepository;

    public DefaultSubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public SubscriptionRequest subscribe(SubscriptionRequest subscriptionRequest) {
        return subscriptionRepository.subscribe(subscriptionRequest);
    }

    @Override
    public List<SubscriptionRequest> getSubscriptions() {
        return subscriptionRepository.getSubscriptions();
    }
}

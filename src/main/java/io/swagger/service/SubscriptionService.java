package io.swagger.service;

import io.swagger.model.SubscriptionRequest;

import java.util.List;

public interface SubscriptionService {

    SubscriptionRequest subscribe(SubscriptionRequest subscriptionRequest);
    List<SubscriptionRequest> getSubscriptions();

}

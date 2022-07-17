package io.swagger.infrastructure;

import io.swagger.model.SubscriptionRequest;

import java.util.List;

public interface SubscriptionRepository {

    SubscriptionRequest subscribe(SubscriptionRequest subscriptionRequest);
    List<SubscriptionRequest> getSubscriptions();


}

package io.swagger.infrastructure;

import io.swagger.model.SubscriptionRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemorySubscriptionRepository implements SubscriptionRepository {

    List<SubscriptionRequest> subscriptions = new ArrayList<>();

    @Override
    public SubscriptionRequest subscribe(SubscriptionRequest subscriptionRequest) {
        subscriptions.add(subscriptionRequest);
        return subscriptionRequest;
    }

    @Override
    public List<SubscriptionRequest> getSubscriptions() {
        return new ArrayList<>(subscriptions);
    }
}

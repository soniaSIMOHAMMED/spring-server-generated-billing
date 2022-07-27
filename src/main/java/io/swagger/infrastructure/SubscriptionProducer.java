package io.swagger.infrastructure;

import io.swagger.model.SubscriptionRequest;
import io.swagger.model.dto.ContractEvent;
import io.swagger.model.dto.BillingEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SubscriptionProducer implements Function<SubscriptionRequest, BillingEvent> {
    private static final String TOPIC = "billing";

    @Autowired
    private KafkaTemplate<String, BillingEvent> kafkaTemplate;

    @Override
    public BillingEvent apply(SubscriptionRequest subscriptionRequest) {
        BillingEvent subscription = new BillingEvent();
        subscription.setSubscriptionType(subscriptionRequest.getSubscriptionType().name());
        subscription.setContractId(subscriptionRequest.getContract().getContractId());
        subscription.setContractRef(subscriptionRequest.getContract().getContractRef());
        subscription.setCreatedAt(subscriptionRequest.getContract().getCreatedAt().toString());
        subscription.setActivatedAt(subscriptionRequest.getContract().getActivatedAt().toString());
        subscription.setExpireAt(subscriptionRequest.getContract().getExpireAt().toString());
       // subscription.setStatus(subscriptionRequest.getContract().getStatus().name());
        subscription.setSellerRef(subscriptionRequest.getSeller().getSellerRef());

        return subscription;
    }

    public void sendMessage(BillingEvent message){
        this.kafkaTemplate.send(TOPIC, message);
    }

    @Bean
    public NewTopic createTopic(){return new NewTopic(TOPIC, 1,(short) 1);}
}

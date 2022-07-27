package io.swagger.infrastructure;

import io.swagger.model.dto.ContractEvent;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

/*@Component("Consumer")
@AllArgsConstructor
public class ContractConsumer  implements Consumer<ContractEvent> {
    //@KafkaListener("contract",groupId="spring-boot-kafka")
    @Override
    public void accept(ContractEvent contractEvent) {
        System.out.println(contractEvent);
    }
}*/
@Service
public class ContractConsumer {
    @KafkaListener(topics = "contract", groupId = "contract_id")
    public void consumeMessage(ContractEvent message){
        System.out.println(message);
    }
}
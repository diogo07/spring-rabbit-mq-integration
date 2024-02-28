package br.com.springrabbitmqintegration.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Consumer {

	@RabbitListener(queues = {"${app.queue.name}"})
    public void receive(@Payload String message) {
        log.info("=== Consumer => {}", message);
    }
}

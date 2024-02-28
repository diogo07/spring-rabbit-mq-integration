package br.com.springrabbitmqintegration.producer;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class Producer {

	private final RabbitTemplate rabbitTemplate;
	private final Queue queue;
	
	public void send(String payload) {
        rabbitTemplate.convertAndSend(this.queue.getName(), payload);
    }
}

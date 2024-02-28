package br.com.springrabbitmqintegration.service;

import org.springframework.stereotype.Service;

import br.com.springrabbitmqintegration.producer.Producer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class MessageService {

	private final Producer producer;
	
	
	
	public void sendMessage(String message) {
		try {
			log.info("=== Solicitando envio da mensagem [{}] para a fila", message);
			producer.send(message);
		} catch (Exception e) {
			log.error("=== Erro no processo de envio de mensagem, {}", e.getMessage());
		}
	}
}

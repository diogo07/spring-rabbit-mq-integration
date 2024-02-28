package br.com.springrabbitmqintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springrabbitmqintegration.service.MessageService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/message")
public class MessageController {

	private final MessageService messageService;
	
	@GetMapping("/send/{message}")
	public void send( @PathVariable String message) {
		messageService.sendMessage(message);
	}
}

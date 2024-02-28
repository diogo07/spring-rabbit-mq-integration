package br.com.springrabbitmqintegration;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class SpringRabbitMqIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMqIntegrationApplication.class, args);
	}

}

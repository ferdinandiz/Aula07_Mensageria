package com.mensageria.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication implements CommandLineRunner {

	@Autowired
	private KafkaProducer produtor;

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		produtor.enviarMensagem("Teste Kafka - 1");
		produtor.enviarMensagem("Teste Kafka - 2");
	}
}

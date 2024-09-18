package com.mensageria.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPICO = "rodando-kafka";

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada: " + mensagem);
        kafkaTemplate.send(TOPICO, mensagem);
    }
}

package com.mensageria.app;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "rodando-kafka", groupId = "grupo-1")
    public void listen(String mensagem) {
        System.err.println("Mensagem recebida: "+mensagem);
    }

}

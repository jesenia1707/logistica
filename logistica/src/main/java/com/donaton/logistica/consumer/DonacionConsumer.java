package com.donaton.logistica.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class DonacionConsumer {

    @RabbitListener(queues = "donaciones")
    public void recibir(String mensaje) {

        System.out.println("================================");
        System.out.println("DONACION RECIBIDA");
        System.out.println(mensaje);
        System.out.println("================================");

    }
}
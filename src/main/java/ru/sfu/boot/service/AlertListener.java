package ru.sfu.boot.service;

import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import ru.sfu.boot.entity.Alert;

/**
 * Java Message Service Listener
 * @author Agapchenko V.V.
 */
@Component
@PropertySource("classpath:application.properties")
public class AlertListener {

    /**
     * Get + process message from Queue
     * @param alert Message from Queue
     */
//    @JmsListener(destination = "${queue.television-queue}")
    @JmsListener(destination = "${spring.artemis.embedded.queues}")
    public void listenMethod(Alert alert) {
        System.out.println(alert);
    }
}

package ru.sfu.boot.service;

import org.springframework.stereotype.Component;
import ru.sfu.boot.entity.Alert;

/**
 * Alert Service Interface
 * @author Agapchenko V.V.
 */
@Component
public interface AlertService {
    /**
     * Send Message to Queue using JMS Template
     * @param alert Alert Message
     */
    void sendAlert(Alert alert);

    /**
     * Get Message from Queue using JMS Template
     * @return Alert Message
     */
    Alert getAlert();
}

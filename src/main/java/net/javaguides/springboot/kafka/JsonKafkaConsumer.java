package net.javaguides.springboot.kafka;

import net.javaguides.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * JsonKafkaConsumer
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 31/08/2026 - 09:19
 * @since 1.17
 */
@Service
public class JsonKafkaConsumer {


    private static final Logger log = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    public JsonKafkaConsumer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "javaguides_json", groupId = "my-group")
    public void consumeJson(final User user) {
        log.info("Consumed JSON message: {}", user);
    }

}

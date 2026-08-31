package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * KafkaTopicConfig
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 30/08/2026 - 20:04
 * @since 1.17
 */
@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name(topicName)
                .build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic() {
        return TopicBuilder.name(topicJsonName)
                .build();
    }

}

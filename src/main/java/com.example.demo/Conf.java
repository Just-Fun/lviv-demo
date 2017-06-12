package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by Sergey on 6/12/17.
 */
@EnableConfigurationProperties(NotificationProp.class)
public class Conf {

    @Bean
    @Profile("PROD")
    @ConditionalOnMissingBean(name = "prodNotificationListener")
    @ConditionalOnProperty(name = "prod.notification", matchIfMissing = true, havingValue = "true")
    public ProdNotificationListener listener() {
        return new ProdNotificationListener();
    }

}

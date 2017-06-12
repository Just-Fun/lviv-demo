package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Created by Sergey on 6/12/17.
 */
@Data
@ConfigurationProperties(prefix = "prod")
public class NotificationProp {

    private List<String> mails;
    private boolean notification;
}

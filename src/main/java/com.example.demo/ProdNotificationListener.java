package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Sergey on 6/12/17.
 */
public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    NotificationProp notificationProp;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        notificationProp.getMails().forEach(System.out::println);
    }
}

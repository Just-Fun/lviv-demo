package com.example.demo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Sergey on 6/12/17.
 */
public class ProfileSentinelApplicationInitializer implements ApplicationContextInitializer{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (applicationContext.getEnvironment().getActiveProfiles().length == 0) {
            throw new IllegalStateException("Без профиля низя!!!");
        }
    }
}

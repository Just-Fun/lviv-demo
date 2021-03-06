package com.example.demo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * Created by Serzh on 6/3/17.
 */
//put in spring.factories
//org.springframework.boot.env.EnvironmentPostProcessor = com.example.demo.DevProfileResolverEnvironmentPostProcessor
public class DevProfileResolverEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment, SpringApplication springApplication) {
        if (configurableEnvironment.getActiveProfiles().length == 0) {

            String os = System.getProperty("os.name");
            if (StringUtils.containsIgnoreCase(os, "mac")) {
//            if (StringUtils.containsIgnoreCase(os, "ubuntu")) {
//                configurableEnvironment.addActiveProfile("DEV");
                configurableEnvironment.addActiveProfile("PROD");
            } else if (StringUtils.containsIgnoreCase(os, "winda")) {
                System.out.println("Crazy...");
            }

            /*Map<String, String> getenv = System.getenv();
            for (Map.Entry<String, String> entry : getenv.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            String home = getenv.get("HOME");
            System.out.println("HOME: " + home);
            if (home.contains("Serzh")) {
                configurableEnvironment.addActiveProfile("DEV");
            }*/
        }
    }
}

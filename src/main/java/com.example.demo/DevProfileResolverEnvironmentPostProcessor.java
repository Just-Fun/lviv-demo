package com.example.demo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by Serzh on 6/3/17.
 */
public class DevProfileResolverEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment, SpringApplication springApplication) {
        if (configurableEnvironment.getActiveProfiles().length == 0) {

            String os = System.getProperty("os.name");
            if (StringUtils.containsIgnoreCase(os, "mac")) {
                configurableEnvironment.addActiveProfile("DEV");
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

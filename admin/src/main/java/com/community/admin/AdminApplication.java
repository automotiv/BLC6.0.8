package com.community.admin;

import com.broadleafcommerce.autoconfigure.DatabaseAutoConfiguration;
import org.broadleafcommerce.common.config.EnableBroadleafAdminAutoConfiguration;
import org.broadleafcommerce.common.web.boot.support.BroadleafBootServletContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"org.springframework.boot.autoconfigure.context",
        "org.springframework.boot.autoconfigure.web.embedded",
        "org.springframework.boot.autoconfigure.security.reactive",
        "org.springframework.boot.autoconfigure.context",
        "com.broadleafcommerce.autoconfigure",
        "org.springframework.boot.autoconfigure.info"
}, basePackageClasses = DatabaseAutoConfiguration.class)
public class AdminApplication extends BroadleafBootServletContextInitializer {

    @Configuration
    @EnableBroadleafAdminAutoConfiguration
    public static class BroadleafFrameworkConfiguration {}

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
 
}


package com.community;

import org.broadleafcommerce.common.config.EnableBroadleafSiteAutoConfiguration;
import org.broadleafcommerce.common.web.boot.support.BroadleafBootServletContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
public class SiteApplication extends BroadleafBootServletContextInitializer {

    @Configuration
    @EnableBroadleafSiteAutoConfiguration
    public static class BroadleafFrameworkConfiguration {}
    
    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);
    }
    
}

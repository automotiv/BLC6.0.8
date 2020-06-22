package com.community.api;

import com.broadleafcommerce.autoconfigure.DatabaseAutoConfiguration;
import org.broadleafcommerce.common.config.EnableBroadleafSiteRootAutoConfiguration;
import org.broadleafcommerce.common.web.boot.support.BroadleafBootServletContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Elbert Bautista (elbertbautista)
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"org.springframework.boot.autoconfigure.context",
        "org.springframework.boot.autoconfigure.web.embedded",
        "org.springframework.boot.autoconfigure.security.reactive",
        "org.springframework.boot.autoconfigure.context",
        "com.broadleafcommerce.autoconfigure",
        "org.springframework.boot.autoconfigure.info"
}, basePackageClasses = DatabaseAutoConfiguration.class)
public class ApiApplication extends BroadleafBootServletContextInitializer {

    @Configuration
    @EnableBroadleafSiteRootAutoConfiguration
    public static class BroadleafFrameworkConfiguration {}

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
    
}

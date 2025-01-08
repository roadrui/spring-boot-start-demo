package com.example.config;

import com.example.business.BusinessModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(BusinessModule.class)
@EnableConfigurationProperties(BusinessModuleProperties.class)
public class BusinessModuleAutoConfigure {

    @Autowired
    private BusinessModuleProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "example.service", value = "enable", havingValue = "true")
    BusinessModule build() {
        return new BusinessModule(properties.getUrl(), properties.getUserName(), properties.getPass());
    }

}
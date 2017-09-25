package org.isouth.task.ns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NSConfiguration {
    @Bean
    public NSController nsController() {
        return new NSController();
    }

    @Bean(initMethod = "init")
    public NSService nsService() {
        return new NSServiceImpl();
    }

}

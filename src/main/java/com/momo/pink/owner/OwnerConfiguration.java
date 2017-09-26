package com.momo.pink.owner;

import com.momo.pink.OwnerService;
import com.momo.pink.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerConfiguration {

    @Bean
    public OwnerService ownerService() {
        return new OwnerServiceImpl();
    }

    @Bean
    public UserController userController() {
        return new UserController();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public GroupController groupController() {
        return new GroupController();
    }
}

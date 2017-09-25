package org.isouth.task.todo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfiguration {
    @Bean
    public TodoController todoController() {
        return new TodoController();
    }

    @Bean
    public TodoService todoService() {
        return new TodoServiceImpl();
    }
}

package com.momo.pink.todo;

import com.momo.pink.CategoryService;
import com.momo.pink.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfiguration {
    @Bean
    public CategoryController categoryController() {
        return new CategoryController();
    }

    @Bean(initMethod = "init")
    public CategoryService categoryService() {
        return new CategoryServiceImpl();
    }

    @Bean
    public TodoController todoController() {
        return new TodoController();
    }

    @Bean
    public TodoService todoService() {
        return new TodoServiceImpl();
    }
}

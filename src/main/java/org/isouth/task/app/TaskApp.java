package org.isouth.task.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ControllerConfiguration.class)
@MapperScan("org.isouth.task")
public class TaskApp {
    public static void main(String[] args) {
        SpringApplication.run(TaskApp.class, args);
    }
}

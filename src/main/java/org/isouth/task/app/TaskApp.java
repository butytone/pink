package org.isouth.task.app;

import org.isouth.task.ns.NSConfiguration;
import org.isouth.task.todo.TodoConfiguration;
import org.isouth.task.user.UserConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
    UserConfiguration.class,
    NSConfiguration.class,
    TodoConfiguration.class
})
@MapperScan("org.isouth.task")
public class TaskApp {
    public static void main(String[] args) {
        SpringApplication.run(TaskApp.class, args);
    }
}

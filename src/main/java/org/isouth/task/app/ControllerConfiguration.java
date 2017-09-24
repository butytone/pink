package org.isouth.task.app;

import org.isouth.task.todo.TodoController;
import org.isouth.task.user.UserController;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    UserController.class,
    TodoController.class
})
public class ControllerConfiguration {
}

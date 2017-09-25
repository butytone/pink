package org.isouth.task.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;
}

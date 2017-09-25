package com.momo.pink.todo;

import com.momo.pink.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;
}

package org.isouth.task.todo;

import org.isouth.task.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDao todoDao;
}

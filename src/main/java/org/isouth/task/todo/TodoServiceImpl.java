package org.isouth.task.todo;

import org.springframework.beans.factory.annotation.Autowired;

public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDao todoDao;
}

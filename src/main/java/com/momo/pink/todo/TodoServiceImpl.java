package com.momo.pink.todo;

import com.momo.pink.Todo;
import com.momo.pink.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDao todoDao;

    @Override
    public Todo addTodo(Todo todo) {
        todoDao.addTodo(todo);
        return todo;
    }
}

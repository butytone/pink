package com.momo.pink.todo;

import com.momo.pink.Todo;
import com.momo.pink.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDao todoDao;

    @Override
    public Todo addTodo(Todo todo) {
        todoDao.addTodo(todo);
        return todo;
    }

    @Override
    public List<Todo> listTodos(long owner) {
        return todoDao.listTodos(owner);
    }

    @Override
    public Todo updateTodo(Todo todo) {
        todoDao.updateTodo(todo);
        return todo;
    }

    @Override
    public Todo getTodo(long id) {
        return todoDao.getTodo(id);
    }
}

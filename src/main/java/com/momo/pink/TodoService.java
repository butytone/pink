package com.momo.pink;

import java.util.List;

/**
 * @since 1.0
 */
public interface TodoService {
    Todo addTodo(Todo todo);

    // TODO 支持分页查询
    // TODO 支持只列出未完成的
    List<Todo> listTodos(long owner);

    Todo updateTodo(Todo todo);

    Todo getTodo(long id);
}

package com.momo.pink;

import java.util.List;

/**
 * @since 1.0
 */
public interface TodoService {
    Todo addTodo(Todo todo);

    List<Todo> listTodos(long owner);
}

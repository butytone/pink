package com.momo.pink.todo;

import com.momo.pink.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDao todoDao;
}

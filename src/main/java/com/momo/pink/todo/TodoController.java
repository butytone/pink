package com.momo.pink.todo;

import com.momo.pink.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@RequestMapping("api/v1.0/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.POST, path = "/{namespace}")
    @ResponseBody
    public Todo addTodo(@PathVariable String namespace, @RequestBody Todo todo,
                        HttpServletRequest request, HttpServletResponse response) {
        String name = request.getHeader("X-PINK-USER");
        User user = userService.getUser(name);
        if (user == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        Owner owner = ownerService.getOwner(namespace);
        if (owner == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        Category category = categoryService.getCategory(
            owner.getId(), CategoryService.DEFAULT);
        todoService.addTodo(todo
            .setCreator(user.getId())
            .setOwner(owner.getId())
            .setCategory(category.getId())
            .setCreateAt(LocalDateTime.now()));
        return todo;
    }
}

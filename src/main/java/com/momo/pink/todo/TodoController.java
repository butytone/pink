package com.momo.pink.todo;

import com.momo.pink.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("api/v1.0/owners/{name}/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.POST, path = "")
    @ResponseBody
    public Todo addTodo(@PathVariable("name") String name, @RequestBody Todo todo,
                        HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getHeader("X-PINK-USER");
        User user = userService.getUser(userName);
        if (user == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        Owner owner = ownerService.getOwner(name);
        if (owner == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        Category category = categoryService.getCategory(
            owner.getId(), Category.DEFAULT);
        todoService.addTodo(todo
            .setCreator(user.getId())
            .setOwner(owner.getId())
            .setCategory(category.getId())
            .setCreateAt(LocalDateTime.now()));
        return todo;
    }

    @RequestMapping(method = RequestMethod.GET, path = "")
    @ResponseBody
    public List<Todo> listTodos(@PathVariable("name") String name, HttpServletResponse response) {
        Owner owner = ownerService.getOwner(name);
        if (owner == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        return todoService.listTodos(owner.getId());
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    @ResponseBody
    public Todo edit(@PathVariable("name") String name, @PathVariable("id") long id, @RequestBody Todo todo) {
        return todoService.updateTodo(todo.setId(id));
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}/complete")
    @ResponseBody
    public Todo complete(@PathVariable("name") String name, @PathVariable("id") long id, HttpServletResponse response) {
        Todo todo = todoService.getTodo(id);
        if (todo == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        return todoService.updateTodo(todo.setStatus(Todo.STATUS_COMPLETED));
    }
}

package com.momo.pink.user;

import com.momo.pink.User;
import com.momo.pink.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("api/v1.0/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationContext ctx;

    @RequestMapping(method = RequestMethod.POST, path = "")
    @ResponseBody
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{email:.+}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("email") String email) {
        userService.deleteUser(email);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{email:.+}")
    @ResponseBody
    public User getUser(@PathVariable("email") String email, HttpServletResponse response) {
        User user = userService.getUser(email);
        if (user == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, path = "")
    @ResponseBody
    public List<User> listUsers() {
        return userService.listUsers();
    }
}

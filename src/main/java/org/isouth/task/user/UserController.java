package org.isouth.task.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.POST, path = "")
    @ResponseBody
    public User addUser(@RequestBody User user) {
        userMapper.addUser(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{email:.+}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("email") String email) {
        userMapper.deleteUser(email);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{email:.+}")
    @ResponseBody
    public User getUser(@PathVariable("email") String email, HttpServletResponse response) {
        User user = userMapper.getUser(email);
        if (user == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, path = "")
    @ResponseBody
    public List<User> listUsers() {
        return userMapper.listUsers();
    }
}

package com.momo.pink.owner;

import com.momo.pink.Owner;
import com.momo.pink.OwnerService;
import com.momo.pink.User;
import com.momo.pink.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("api/v1.0/users")
public class UserController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, path = "")
    @ResponseBody
    public User addUser(@RequestBody User user) {
        Owner owner = ownerService.addOwner(new Owner()
            .setName(user.getName())
            .setType(Owner.USER_TYPE));
        userService.addUser(user.setId(
            owner.getId()));
        return user;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{name}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("name") String name, HttpServletResponse response) {
        User user = userService.getUser(name);
        if (user == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        userService.deleteUser(name);
        ownerService.deleteOwner(user.getId());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    @ResponseBody
    public User getUser(@PathVariable("name") String name, HttpServletResponse response) {
        User user = userService.getUser(name);
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

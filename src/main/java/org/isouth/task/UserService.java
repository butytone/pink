package org.isouth.task;

import io.reactivex.Observable;
import org.isouth.task.user.User;
import org.isouth.task.user.UserEvent;

import java.util.List;

public interface UserService {
    Observable<UserEvent> observe();

    User addUser(User user);

    void deleteUser(String email);

    User getUser(String email);

    List<User> listUsers();
}

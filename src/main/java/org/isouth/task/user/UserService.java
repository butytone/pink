package org.isouth.task.user;

import io.reactivex.Observable;

import java.util.List;

public interface UserService {
    Observable<UserEvent> observe();

    User addUser(User user);

    void deleteUser(String email);

    User getUser(String email);

    List<User> listUsers();
}

package com.momo.pink;

import io.reactivex.Observable;

import java.util.List;

/**
 * @since 1.0
 */
public interface UserService {
    Observable<UserEvent> observe();

    User addUser(User user);

    void deleteUser(String email);

    User getUser(String email);

    List<User> listUsers();
}

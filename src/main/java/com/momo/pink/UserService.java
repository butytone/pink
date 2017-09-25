package com.momo.pink;

import io.reactivex.Observable;
import com.momo.pink.user.User;
import com.momo.pink.user.UserEvent;

import java.util.List;

public interface UserService {
    Observable<UserEvent> observe();

    User addUser(User user);

    void deleteUser(String email);

    User getUser(String email);

    List<User> listUsers();
}

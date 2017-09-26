package com.momo.pink.owner;

import com.momo.pink.User;
import com.momo.pink.UserEvent;
import com.momo.pink.UserService;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private Subject<UserEvent> subject = PublishSubject.create();

    @Override
    public Observable<UserEvent> observe() {
        return subject;
    }

    @Override
    public User addUser(User user) {
        userDao.addUser(user);
        subject.onNext(new UserEvent(
            UserEvent.ADD, user));
        return user;
    }

    @Override
    public void deleteUser(String name) {
        User user = getUser(name);
        if (user != null) {
            userDao.deleteUser(name);
            subject.onNext(new UserEvent(
                UserEvent.DELETE, user));
        }

    }

    @Override
    public User getUser(String name) {
        return userDao.getUser(name);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}

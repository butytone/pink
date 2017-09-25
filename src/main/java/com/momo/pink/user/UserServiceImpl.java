package com.momo.pink.user;

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
        subject.onNext(new UserEvent(UserEvent.ADD, user));
        return user;
    }

    @Override
    public void deleteUser(String email) {
        User user = getUser(email);
        if (user != null) {
            userDao.deleteUser(email);
            subject.onNext(new UserEvent(
                UserEvent.DELETE, user));
        }

    }

    @Override
    public User getUser(String email) {
        return userDao.getUser(email);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}

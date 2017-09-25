package org.isouth.task.user;

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
        userDao.deleteUser(email);
        subject.onNext(new UserEvent(UserEvent.DELETE,
            new User().setEmail(email)));
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

package com.momo.pink.ns;

import com.momo.pink.*;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NSServiceImpl implements NSService {
    @Autowired
    private NSDao nsDao;

    @Autowired
    private UserService userService;

    private Subject<NSEvent> subject = PublishSubject.create();

    public void init() {
        userService.observe().subscribe(e -> {
            if (UserEvent.ADD.equals(e.getType())) {
                addNS(new NS()
                    .setName(e.getUser()
                        .getName())
                    .setType(NS.USER_TYPE));
            } else {
                deleteNS(e.getUser()
                    .getName());
            }
        });
    }

    @Override
    public Observable<NSEvent> observe() {
        return subject;
    }

    @Override
    public NS addNS(NS ns) {
        nsDao.addNS(ns);
        subject.onNext(new NSEvent(
            NSEvent.ADD, ns));
        return ns;
    }

    @Override
    public void deleteNS(String name) {
        nsDao.deleteNS(name);
        // TODO 发事件
    }

    @Override
    public List<NS> listNSs() {
        return null;
    }

    @Override
    public NS getNS(int id) {
        return nsDao.getNSByID(id);
    }

    @Override
    public NS getNS(String name) {
        return nsDao.getNSByName(name);
    }
}

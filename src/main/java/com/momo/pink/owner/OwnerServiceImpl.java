package com.momo.pink.owner;

import com.momo.pink.Owner;
import com.momo.pink.OwnerEvent;
import com.momo.pink.OwnerService;
import com.momo.pink.UserService;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerDao nsDao;

    @Autowired
    private UserService userService;

    private Subject<OwnerEvent> subject = PublishSubject.create();

    @Override
    public Observable<OwnerEvent> observe() {
        return subject;
    }

    @Override
    public Owner addOwner(Owner owner) {
        nsDao.addOwner(owner);
        subject.onNext(new OwnerEvent(
            OwnerEvent.ADD, owner));
        return owner;
    }

    @Override
    public void deleteOwner(long id) {
        nsDao.deleteOwner(id);
        subject.onNext(new OwnerEvent(
            OwnerEvent.DELETE,
            new Owner().setId(id)
        ));
    }

    @Override
    public List<Owner> listOwners() {
        return null;
    }

    @Override
    public Owner getOwner(int id) {
        return nsDao.getOwnerByID(id);
    }

    @Override
    public Owner getOwner(String name) {
        return nsDao.getOwnerByName(name);
    }
}

package com.momo.pink;

import io.reactivex.Observable;

import java.util.List;

/**
 * @since 1.0
 */
public interface OwnerService {

    Observable<OwnerEvent> observe();

    Owner addOwner(Owner owner);

    void deleteOwner(long id);

    // TODO 支持分页
    List<Owner> listOwners();

    Owner getOwner(int id);

    Owner getOwner(String name);
}

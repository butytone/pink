package com.momo.pink;

import io.reactivex.Observable;

import java.util.List;

/**
 * @since 1.0
 */
public interface NSService {

    Observable<NSEvent> observe();

    NS addNS(NS ns);

    void deleteNS(String id);

    List<NS> listNSs();

    NS getNS(int id);

    NS getNS(String name);
}

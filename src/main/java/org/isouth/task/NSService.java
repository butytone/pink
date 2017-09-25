package org.isouth.task;

import org.apache.ibatis.annotations.Select;
import org.isouth.task.ns.NS;

import java.util.List;

public interface NSService {
    NS addNS(NS ns);

    void deleteNS(String id);

    @Select("SELECT * FROM NS")
    List<NS> listNSs();
}

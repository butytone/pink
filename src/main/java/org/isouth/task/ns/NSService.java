package org.isouth.task.ns;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NSService {
    NS addNS(NS ns);

    void deleteNS(String id);

    @Select("SELECT * FROM NS")
    List<NS> listNSs();
}

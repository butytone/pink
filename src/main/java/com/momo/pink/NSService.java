package com.momo.pink;

import com.momo.pink.ns.NS;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NSService {
    NS addNS(NS ns);

    void deleteNS(String id);

    @Select("SELECT * FROM NS")
    List<NS> listNSs();
}

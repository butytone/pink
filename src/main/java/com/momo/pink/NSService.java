package com.momo.pink;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @since 1.0
 */
public interface NSService {
    NS addNS(NS ns);

    void deleteNS(String id);

    @Select("SELECT * FROM NS")
    List<NS> listNSs();
}

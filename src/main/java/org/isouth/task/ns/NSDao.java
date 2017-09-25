package org.isouth.task.ns;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NSDao {
    @Insert("INSERT INTO NS (TYPE, NAME) VALUES(#{type},#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
    void addNS(NS ns);

    @Delete("DELETE FROM NS WHERE ID=#{id}")
    void deleteNS(String id);

    @Select("SELECT * FROM NS")
    List<NS> listNSs();
}

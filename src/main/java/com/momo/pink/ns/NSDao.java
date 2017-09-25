package com.momo.pink.ns;

import com.momo.pink.NS;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NSDao {
    @Insert("INSERT INTO NS (TYPE, NAME) VALUES(#{type},#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
    void addNS(NS ns);

    @Delete("DELETE FROM NS WHERE NAME=#{name}")
    void deleteNS(String name);

    @Select("SELECT * FROM NS")
    List<NS> listNSs();
}

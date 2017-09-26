package com.momo.pink.owner;

import com.momo.pink.Owner;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OwnerDao {
    @Insert("INSERT INTO OWNERS (TYPE, NAME) VALUES(#{type},#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
    void addOwner(Owner owner);

    @Delete("DELETE FROM OWNERS WHERE ID=#{id}")
    void deleteOwner(long name);

    @Select("SELECT ID, TYPE, NAME FROM OWNERS")
    List<Owner> listOwners();

    @Select("SELECT ID, TYPE, NAME FROM OWNERS WHERE ID=#{id}")
    Owner getOwnerByID(int id);

    @Select("SELECT ID, TYPE, NAME FROM OWNERS WHERE NAME=#{name}")
    Owner getOwnerByName(String name);
}

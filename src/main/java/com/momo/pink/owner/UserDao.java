package com.momo.pink.owner;

import com.momo.pink.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("SELECT ID, EMAIL, NAME FROM USERS")
    List<User> listUsers();

    @Select("SELECT ID, EMAIL, NAME FROM USERS WHERE NAME=#{name}")
    User getUser(String name);

    @Insert("INSERT INTO USERS (ID, EMAIL, NAME) VALUES(#{id}, #{email},#{name})")
    void addUser(User user);

    @Delete("DELETE FROM USERS WHERE NAME=#{name}")
    void deleteUser(String name);
}

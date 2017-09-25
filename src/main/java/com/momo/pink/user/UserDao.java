package com.momo.pink.user;

import com.momo.pink.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("SELECT * FROM USERS")
    List<User> listUsers();

    @Select("SELECT * FROM USERS WHERE NAME=#{name}")
    User getUser(String name);

    @Insert("INSERT INTO USERS (EMAIL, NAME) VALUES(#{email},#{name})")
    void addUser(User user);

    @Delete("DELETE FROM USERS WHERE NAME=#{name}")
    void deleteUser(String name);
}

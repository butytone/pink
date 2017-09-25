package org.isouth.task.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("SELECT * FROM USERS")
    List<User> listUsers();

    @Select("SELECT * FROM USERS WHERE EMAIL=#{email}")
    User getUser(String email);

    @Insert("INSERT INTO USERS (EMAIL, NAME) VALUES(#{email},#{name})")
    void addUser(User user);

    @Delete("DELETE FROM USERS WHERE EMAIL=#{email}")
    void deleteUser(String email);
}

package org.isouth.task.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USERS")
    List<User> listUsers();

    @Select("SELECT * FROM USERS WHERE EMAIL=#{email}")
    User getUser(String email);

    @Insert("INSERT INTO USERS (EMAIL, ALIAS) VALUES(#{email},#{alias})")
    void addUser(User user);

    @Delete("DELETE FROM USERS WHERE EMAIL=#{email}")
    void deleteUser(String email);
}

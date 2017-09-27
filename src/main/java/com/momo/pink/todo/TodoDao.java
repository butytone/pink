package com.momo.pink.todo;

import com.momo.pink.Todo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoDao {
    @Insert("INSERT INTO TODOS (TITLE, OWNER, CREATOR, CATEGORY, CREATE_AT) VALUES(#{title},#{owner}, #{creator}, #{category},#{createAt})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
    void addTodo(Todo todo);

    @Select("SELECT ID, TITLE, OWNER, CREATOR, CATEGORY, CREATE_AT, STATUS FROM TODOS WHERE OWNER=#{owner}")
    @Results({@Result(property = "createAt", column = "CREATE_AT")})
    List<Todo> listTodos(long owner);

    @Update("UPDATE TODOS SET TITLE=#{title}, CATEGORY=#{category}, STATUS=#{status} WHERE ID=#{id}")
    void updateTodo(Todo todo);

    @Select("SELECT ID, TITLE, OWNER, CREATOR, CATEGORY, CREATE_AT, STATUS FROM TODOS WHERE ID=#{id}")
    @Results({@Result(property = "createAt", column = "CREATE_AT")})
    Todo getTodo(long id);
}

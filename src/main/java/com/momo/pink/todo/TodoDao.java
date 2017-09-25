package com.momo.pink.todo;

import com.momo.pink.Todo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface TodoDao {
    @Insert("INSERT INTO TODOS (TITLE, OWNER, CREATOR, CATEGORY, CREATE_AT) VALUES(#{title},#{owner}, #{creator}, #{category},#{createAt})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
    void addTodo(Todo todo);
}

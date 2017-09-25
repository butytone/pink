package com.momo.pink.todo;

import com.momo.pink.Category;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CategoryDao {

    @Insert("INSERT INTO CATEGORIES (NAME, OWNER) VALUES(#{name},#{owner})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
    void addCategory(Category category);

    @Select("SELECT * FROM CATEGORIES WHERE ID=#{id}")
    Category getCategoryByID(int id);

    @Select("SELECT * FROM CATEGORIES WHERE OWNER=#{owner} AND NAME=#{name}")
    Category getCategoryByName(@Param("owner") int owner, @Param("name") String name);

}

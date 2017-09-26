package com.momo.pink.todo;

import com.momo.pink.Category;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CategoryDao {

    @Insert("INSERT INTO CATEGORIES (NAME, OWNER) VALUES(#{name},#{owner})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
    void addCategory(Category category);

    @Select("SELECT * FROM CATEGORIES WHERE ID=#{id}")
    Category getCategoryByID(long id);

    @Select("SELECT * FROM CATEGORIES WHERE OWNER=#{owner} AND NAME=#{name}")
    Category getCategoryByName(@Param("owner") long owner, @Param("name") String name);

    @Delete("DELETE FROM CATEGORIES WHERE OWNER=#{owner}")
    void deleteAllCategories(long owner);
}

package com.momo.pink;

/**
 * @since 1.0
 */
public interface CategoryService {

    Category getCategory(long id);

    Category getCategory(long owner, String name);
}

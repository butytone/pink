package com.momo.pink;

/**
 * @since 1.0
 */
public interface CategoryService {
    String DEFAULT = "default";

    Category getCategory(int id);

    Category getCategory(int owner, String name);
}

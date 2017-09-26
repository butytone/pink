package com.momo.pink;

/**
 * @since 1.0
 */
public interface CategoryService {
    String DEFAULT = "default";

    Category getCategory(long id);

    Category getCategory(long owner, String name);
}

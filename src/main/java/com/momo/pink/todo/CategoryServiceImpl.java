package com.momo.pink.todo;

import com.momo.pink.Category;
import com.momo.pink.CategoryService;
import com.momo.pink.NSEvent;
import com.momo.pink.NSService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private NSService nsService;

    @Autowired
    private CategoryDao categoryDao;

    public void init() {
        nsService.observe().subscribe(e -> {
            if (NSEvent.ADD.equals(e.getType())) {
                categoryDao.addCategory(new Category()
                    .setName(CategoryService.DEFAULT)
                    .setOwner(e.getNS().getId()));
            }
        });
    }

    @Override
    public Category getCategory(int id) {
        return categoryDao.getCategoryByID(id);
    }

    @Override
    public Category getCategory(int owner, String name) {
        return categoryDao.getCategoryByName(owner, name);
    }
}

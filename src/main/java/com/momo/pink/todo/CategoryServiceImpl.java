package com.momo.pink.todo;

import com.momo.pink.Category;
import com.momo.pink.CategoryService;
import com.momo.pink.OwnerEvent;
import com.momo.pink.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private OwnerService ownerService;

    @Autowired
    private CategoryDao categoryDao;

    public void init() {
        ownerService.observe().subscribe(e -> {
            if (OwnerEvent.ADD.equals(e.getType())) {
                categoryDao.addCategory(new Category()
                    .setName(Category.DEFAULT)
                    .setOwner(e.getOwner().getId()));
            } else {
                categoryDao.deleteAllCategories(
                    e.getOwner().getId());
            }
        });
    }

    @Override
    public Category getCategory(long id) {
        return categoryDao.getCategoryByID(id);
    }

    @Override
    public Category getCategory(long owner, String name) {
        return categoryDao.getCategoryByName(owner, name);
    }
}

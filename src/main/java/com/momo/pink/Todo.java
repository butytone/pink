package com.momo.pink;

import java.util.Date;

/**
 * @since 1.0
 */
public class Todo {
    private Long id;
    private String title;
    private Long owner;
    private Long creator;
    private Long category;
    private Date createAt;

    public Long getId() {
        return id;
    }

    public Todo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Todo setTitle(String title) {
        this.title = title;
        return this;
    }

    public Long getOwner() {
        return owner;
    }

    public Todo setOwner(Long owner) {
        this.owner = owner;
        return this;
    }

    public Long getCreator() {
        return creator;
    }

    public Todo setCreator(Long creator) {
        this.creator = creator;
        return this;
    }

    public Long getCategory() {
        return category;
    }

    public Todo setCategory(Long category) {
        this.category = category;
        return this;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Todo setCreateAt(Date createAt) {
        this.createAt = createAt;
        return this;
    }
}

package com.momo.pink;

import java.time.LocalDateTime;

/**
 * @since 1.0
 */
public class Todo {
    private Long id;
    private String title;
    private Integer owner;
    private String creator;
    private Integer category;
    private LocalDateTime createAt;

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

    public Integer getOwner() {
        return owner;
    }

    public Todo setOwner(Integer owner) {
        this.owner = owner;
        return this;
    }

    public String getCreator() {
        return creator;
    }

    public Todo setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public Todo setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public Todo setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
        return this;
    }
}

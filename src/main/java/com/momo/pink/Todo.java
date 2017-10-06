package com.momo.pink;

import java.time.LocalDateTime;

/**
 * @since 1.0
 */
public class Todo {
    public static final String STATUS_CREATED = "CREATED";
    public static final String STATUS_COMPLETED = "COMPLETED";
    private Long id;
    private String title;
    private Long owner;
    private Long creator;
    private Long category;
    private LocalDateTime createAt;
    private boolean completed;

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

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public Todo setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Todo setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }
}

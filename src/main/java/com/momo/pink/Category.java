package com.momo.pink;

/**
 * @since 1.0
 */
public class Category {
    public static final String DEFAULT = "default";
    private Long id;
    private String name;
    private Long owner;

    public Long getId() {
        return id;
    }

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public Long getOwner() {
        return owner;
    }

    public Category setOwner(Long owner) {
        this.owner = owner;
        return this;
    }
}

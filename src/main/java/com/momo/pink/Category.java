package com.momo.pink;

/**
 * @since 1.0
 */
public class Category {
    private Integer id;
    private String name;
    private Integer owner;

    public Integer getId() {
        return id;
    }

    public Category setId(Integer id) {
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

    public Integer getOwner() {
        return owner;
    }

    public Category setOwner(Integer owner) {
        this.owner = owner;
        return this;
    }
}

package com.momo.pink;

/**
 * @since 1.0
 */
public class Owner {
    public static final int USER_TYPE = 0;
    public static final int GROUP_TYPE = 1;
    private Long id;
    private int type;
    private String name;

    public Long getId() {
        return id;
    }

    public Owner setId(Long id) {
        this.id = id;
        return this;
    }

    public int getType() {
        return type;
    }

    public Owner setType(int type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public Owner setName(String name) {
        this.name = name;
        return this;
    }
}

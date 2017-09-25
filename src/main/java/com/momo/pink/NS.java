package com.momo.pink;

/**
 * @since 1.0
 */
public class NS {
    public static final int USER_TYPE = 0;
    public static final int GROUP_TYPE = 1;
    private Integer id;
    private int type;
    private String name;

    public Integer getId() {
        return id;
    }

    public NS setId(Integer id) {
        this.id = id;
        return this;
    }

    public int getType() {
        return type;
    }

    public NS setType(int type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public NS setName(String name) {
        this.name = name;
        return this;
    }
}

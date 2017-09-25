package org.isouth.task.ns;

public class NS {
    public static final int USER_TYPE = 0;
    public static final int GROUP_TYPE = 1;
    private String id;
    private int type;
    private String name;

    public String getId() {
        return id;
    }

    public NS setId(String id) {
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

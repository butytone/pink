package com.momo.pink;

/**
 * @since 1.0
 */
public class User {
    //TODO 增加 ID 字段
    private String email;
    private String name;

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}

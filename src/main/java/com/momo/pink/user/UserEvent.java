package com.momo.pink.user;

import java.util.EventObject;

public class UserEvent extends EventObject {

    public static final String ADD = "ADD";
    public static final String DELETE = "DELETE";

    private final String type;

    public UserEvent(String type, User source) {
        super(source);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public User getUser() {
        return (User) super.getSource();
    }

}

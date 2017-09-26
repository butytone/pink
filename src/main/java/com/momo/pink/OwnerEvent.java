package com.momo.pink;

import java.util.EventObject;

/**
 * @since 1.0
 */
public class OwnerEvent extends EventObject {

    public static final String ADD = "ADD";
    public static final String DELETE = "DELETE";

    private final String type;

    public OwnerEvent(String type, Owner source) {
        super(source);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Owner getOwner() {
        return (Owner) super.getSource();
    }
}

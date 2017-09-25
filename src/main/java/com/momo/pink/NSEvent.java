package com.momo.pink;

import java.util.EventObject;

/**
 * @since 1.0
 */
public class NSEvent extends EventObject {

    public static final String ADD = "ADD";
    public static final String DELETE = "DELETE";

    private final String type;

    public NSEvent(String type, NS source) {
        super(source);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public NS getNS() {
        return (NS) super.getSource();
    }
}

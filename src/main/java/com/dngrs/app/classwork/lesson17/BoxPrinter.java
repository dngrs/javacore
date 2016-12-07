package com.dngrs.app.classwork.lesson17;

/**
 * Created by I. Odokienko on 11/30/16.
 */
public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public Object getValue() {
        return val;
    }
}

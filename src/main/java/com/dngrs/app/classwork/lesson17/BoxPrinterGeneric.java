package com.dngrs.app.classwork.lesson17;

/**
 * Created by I. Odokienko on 11/30/16.
 */
public class BoxPrinterGeneric<T> {
    private T val;

    // T stands for "Type" – this is placeholder
    public BoxPrinterGeneric(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}

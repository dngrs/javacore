package com.dngrs.app.classwork.lesson19;

import java.util.Objects;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class Word {
    String string;

    public Word(String word) {
        this.string = word;
    }

    @Override
    public boolean equals(Object string) {
        if (this.string.equalsIgnoreCase(string.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(string.toLowerCase());
    }

    @Override
    public String toString() {
        return string;
    }
}

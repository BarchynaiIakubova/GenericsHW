package com.company;

import java.util.Objects;

public class Box<T1, T2>{
    private T1 size;
    private T2 color;

    public T1 getSize() {
        return size;
    }

    public void setSize(T1 size) {
        this.size = size;
    }

    public T2 getColor() {
        return color;
    }

    public void setColor(T2 color) {
        this.color = color;
    }

    public static <T1, T2> Box<T1, T2> getObject(T1 size, T2 color) {
        Box<T1, T2> boxOb = new Box();
        boxOb.size = size;
        boxOb.color = color;
        return boxOb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?, ?> box = (Box<?, ?>) o;
        return Objects.equals(size, box.size) && Objects.equals(color, box.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }

    @Override
    public String toString() {
        return "size = " + size +
                ", color = " + color;
    }
}

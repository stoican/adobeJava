package com.adobeJava.week3;

public class IntBuffer {
    private Integer value;

    public IntBuffer() {
        this.value = 0;
    }

    public IntBuffer(Integer value) {
        if (value == null) {
            throw new RuntimeException();
        }

        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        if (value == null) {
            throw new RuntimeException();
        }

        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + "";
    }
}

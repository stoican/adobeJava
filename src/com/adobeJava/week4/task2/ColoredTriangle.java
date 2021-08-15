package com.adobeJava.week4.task2;

import java.util.Objects;

public class ColoredTriangle extends Triangle {
    private final Color color;

    public ColoredTriangle(Point a, Point b, Point c, Color color) {
        super(a, b, c);
        this.color = color;
    }
    public ColoredTriangle(Point a, Point b, Point c) {
        super(a, b, c);
        this.color = Color.WHITE;
    }
    public ColoredTriangle(ColoredTriangle triangle) {
        super(triangle);
        this.color = triangle.color;
    }

    @Override
    public String toString() {
        return  super.toString() + ", color=" + color + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColoredTriangle that = (ColoredTriangle) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}

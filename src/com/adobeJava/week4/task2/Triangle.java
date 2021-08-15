package com.adobeJava.week4.task2;

import java.util.Objects;

public class Triangle implements Cloneable {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        AssertionUtils.assertNotNull(a);
        AssertionUtils.assertNotNull(b);
        AssertionUtils.assertNotNull(c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Triangle triangle) {
        this.a = triangle.a;
        this.b = triangle.b;
        this.c = triangle.c;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " a= " + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a.equals(triangle.a) && b.equals(triangle.b) && c.equals(triangle.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }


}

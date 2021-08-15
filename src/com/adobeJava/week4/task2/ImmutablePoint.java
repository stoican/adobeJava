package com.adobeJava.week4.task2;

import java.util.Objects;

public final class ImmutablePoint implements Point {
    private final double x;
    private final double y;


    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point shiftLeft() {
        return new ImmutablePoint(this.x - 1.0, this.y);
    }

    public Point shiftRight() {
        return new ImmutablePoint(this.x + 1.0, this.y);
    }

    public Point shiftUp() {
        return new ImmutablePoint(this.x, this.y + 1);
    }

    public Point shiftDown() {
        return new ImmutablePoint(this.x, this.y - 1);
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "{x=" + x + ", y=" + y + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

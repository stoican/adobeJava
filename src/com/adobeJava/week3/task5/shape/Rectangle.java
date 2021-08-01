package com.adobeJava.week3.task5.shape;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        if (length > 0.0 && width > 0.0) {
            this.length = length;
            this.width = width;
        } else {
            throw new RuntimeException("Please provide positive numbers.");
        }
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}

package com.adobeJava.week3.task5.shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        if (!(radius > 0.0)) {
            throw new RuntimeException("Please provide a positive number");
        }

        this.radius = radius;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

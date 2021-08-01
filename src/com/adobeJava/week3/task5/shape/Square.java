package com.adobeJava.week3.task5.shape;

public class Square implements Shape {
    private final double sideLength;

    public Square(double sideLength) {
        if (sideLength > 0.0) {
            this.sideLength = sideLength;
        } else {
            throw new RuntimeException("Provide a positive number");
        }
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}

package com.adobeJava.week3.task5.shape;

public class RightTriangle implements Shape {
    private double a;
    private double b;
    private double c;

    public RightTriangle(double a, double b, double c) {
        if (!(a > 0.0 && b > 0.0 && c > 0.0)) {
            throw new RuntimeException("Please provide positive numbers");
        } else if (Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2)) {
            throw new RuntimeException("Invalid right triangle side lengths");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public double calculateArea() {
        return (a * b) / 2;
    }
}

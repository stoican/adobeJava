package com.adobeJava.week3.task5.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println(circle.calculateArea());

        Shape rightTriangle = new RightTriangle(4, 3, 5);
        System.out.println(rightTriangle.calculateArea());
    }
}

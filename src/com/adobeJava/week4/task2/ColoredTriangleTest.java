package com.adobeJava.week4.task2;

public class ColoredTriangleTest {
    public static void main(String[] args) {
        Point points[] = new Point[3];
        points[0] = new ImmutablePoint(1.0, 1.0);
        points[1] = new ImmutablePoint(3.0, 3.0);
        points[2] = new ImmutablePoint(5.0, 0.0);

        ColoredTriangle coloredTriangle = new ColoredTriangle(points[0], points[1], points[2]);
        Triangle coloredTriangle2 = new ColoredTriangle(points[0], points[1], points[2]);
        Triangle regularTriangle = new Triangle(points[0], points[1], points[2]);

        AssertionUtils.assertEquals(coloredTriangle.toString(), coloredTriangle2.toString());
        AssertionUtils.assertEquals(regularTriangle.equals((Triangle) coloredTriangle2), coloredTriangle2.equals(regularTriangle));
    }
}

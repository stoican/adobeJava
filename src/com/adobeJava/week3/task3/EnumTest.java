package com.adobeJava.week3.task3;

public class EnumTest {
    public static void main(String[] args) {
        Directions oneDirection = Directions.EAST;
        System.out.println(oneDirection);

        for (Directions direction : Directions.values()) {
            System.out.println(direction);
        }

        System.out.println(Months.getMonth(1).orElse(null));
        System.out.println(Months.getMonth(0).orElse(null));
    }
}

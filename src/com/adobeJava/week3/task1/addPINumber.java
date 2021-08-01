package com.adobeJava.week3.task1;

import java.util.ArrayList;
import java.util.List;

public class addPINumber {
    public static void main(String[] args) {
        List<Double> elements = new ArrayList<Double>(10);

        for (int i = 0; i < 10; i++) {
            double pi = Math.PI;
            elements.add(pi);
        }

        double unboxedValue = elements.get(elements.size() - 1);
        System.out.println(unboxedValue);

    }
}

package com.adobeJava.week3.task1;

import java.util.Random;

public class RandomNegativeNumberGenerator {
    private final Integer randomNumber;

    public static void main(String[] args) {
        RandomNegativeNumberGenerator num = new RandomNegativeNumberGenerator();
        System.out.println(num.getAbsoluteNumber());

    }

    public RandomNegativeNumberGenerator() {
        Random random = new Random();
        this.randomNumber = (random.nextInt(Integer.MAX_VALUE) - 1) * -1;
    }

    public Integer getAbsoluteNumber() {
        return Math.abs(randomNumber);
    }


}

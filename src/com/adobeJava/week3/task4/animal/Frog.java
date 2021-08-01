package com.adobeJava.week3.task4.animal;

public class Frog implements WaterAnimal {
    @Override
    public void isBreathing() {
        System.out.println("I don't breathe like humans do.");
    }

    @Override
    public void isSwimming() {
        System.out.println("I do swim. I can also jump!");
    }
}

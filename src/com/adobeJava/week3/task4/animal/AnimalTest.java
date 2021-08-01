package com.adobeJava.week3.task4.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal lion = new LandAnimal() {
            @Override
            public void isRunning() {
                System.out.println("Get ready to be eaten! ");
            }

            @Override
            public void isBreathing() {
                System.out.println("I'm just a regular cat!");
            }
        };

        Animal whale = new WaterAnimal() {

            @Override
            public void isSwimming() {
                System.out.println("I don't just swim. I own the oceans!");
            }

            @Override
            public void isBreathing() {
                System.out.println("Get out of the way!");
            }
        };

        Frog frog = new Frog();
        frog.isBreathing();
    }
}

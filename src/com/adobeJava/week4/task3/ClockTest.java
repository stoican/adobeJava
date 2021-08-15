package com.adobeJava.week4.task3;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short choice = scanner.nextShort();
        if (choice == 1) {
            new FastClock().start();
        } else if (choice == 2) {
            new SlowClock().start();
        } else {
            throw new RuntimeException("Invalid argument");
        }

    }
}

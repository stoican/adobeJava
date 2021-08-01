package com.adobeJava.week3.task2;

public class Laptop {
    public static int laptopCount = 0;
    public static int laptopCountFromDerivedClass = 0;
    private long serialNumber;

    protected Laptop(long serialNumber) {
        this.serialNumber = serialNumber;
        laptopCountFromDerivedClass++;
    }

    public Laptop() {
        laptopCount++;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
}

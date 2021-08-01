package com.adobeJava.week3.task2;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();
        DerivedLaptop laptop4 = new DerivedLaptop(181818101);
        DerivedLaptop laptop5 = new DerivedLaptop(181818189);
        DerivedLaptop laptop6 = new DerivedLaptop(181818182);

        System.out.println(Laptop.laptopCount);
        System.out.println(Laptop.laptopCountFromDerivedClass);
    }
}

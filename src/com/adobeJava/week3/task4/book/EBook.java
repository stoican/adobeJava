package com.adobeJava.week3.task4.book;

public class EBook extends PaperBook implements Book {
    private double sizeInMB;

    public EBook(String author, String genre, int numberOfPages, double sizeInMB) {
        super(author, genre, numberOfPages);
        this.sizeInMB = sizeInMB;
    }

    @Override
    public void open() {

    }

    @Override
    public void browsePage() {

    }

    @Override
    public void close() {

    }

    public double getSizeInMB() {
        return sizeInMB;
    }
}

package com.adobeJava.week3.task4.book;

public class PaperBook implements Book {
    private final int numberOfPages;
    private final String author;
    private final String genre;

    public PaperBook(String author, String genre, int numberOfPages) {
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

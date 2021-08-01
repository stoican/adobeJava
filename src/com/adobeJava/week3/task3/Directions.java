package com.adobeJava.week3.task3;

public enum Directions {
    EAST("East"),
    WEST("West"),
    SOUTH("South"),
    NORTH("North");

    private final String textRepresentation;

    private Directions(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    @Override
    public String toString() {
        return this.textRepresentation;
    }
}

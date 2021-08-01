package com.adobeJava.week3.task3;

import java.util.Optional;

public enum Months {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEP(9),
    OCT(10),
    NOV(11),
    DEC(12);

    private int value;

    private Months(int value) {
        this.value = value;
    }

    public static Optional<String> getMonth(int i) {
        Optional<String> value = Optional.empty();
        if (i >= 1 && i <= 12) {
            value = Optional.ofNullable(String.valueOf(Months.values()[i - 1]));
        }
        return value;
    }
}

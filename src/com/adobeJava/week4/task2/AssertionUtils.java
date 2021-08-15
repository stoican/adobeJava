package com.adobeJava.week4.task2;

public class AssertionUtils {

    public static void assertEquals(int val1, int val2) {
        if (val1 != val2) {
            throw new RuntimeException("Equal values");
        }
    }

    public static void assertEquals(double val1, double val2) {
        if (val1 != val2) {
            throw new RuntimeException("Equal values");
        }
    }

    public static void assertEquals(String val1, String val2) {
        if (!val1.equals(val2)) {
            throw new RuntimeException("Equal values");
        }
    }

    public static void assertEquals(boolean val1, boolean val2) {
        System.out.println(val1);
        System.out.println(val2);
        if (val1 != val2) {
            throw new RuntimeException("Equal values");
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new RuntimeException("Object is Null");
        }
    }
}

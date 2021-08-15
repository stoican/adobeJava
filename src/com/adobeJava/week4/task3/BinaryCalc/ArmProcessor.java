package com.adobeJava.week4.task3.BinaryCalc;

public class ArmProcessor implements Processor {
    public static final long EXEC_MS = X8664Processor.EXEC_MS * 2;

    @Override
    public String calculateBinary(long decimal) {
        long start = System.currentTimeMillis();
        String binaryString = Long.toBinaryString(decimal);
        long end = System.currentTimeMillis();

        try {
            Thread.sleep(EXEC_MS - (end - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return binaryString;
    }

}

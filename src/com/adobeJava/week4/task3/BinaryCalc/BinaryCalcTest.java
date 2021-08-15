package com.adobeJava.week4.task3.BinaryCalc;

import com.adobeJava.week4.task2.AssertionUtils;

public class BinaryCalcTest {
    public static void main(String[] args) {
        Processor x86 = new X86Processor();
        Processor x64 = new X8664Processor();
        Processor arm = new ArmProcessor();

        AssertionUtils.assertEquals(x86.calculateBinary(25), "11001");
        AssertionUtils.assertEquals(x86.calculateBinary(884), "1101110100");
        AssertionUtils.assertEquals(x86.calculateBinary(721), "1011010001");

        AssertionUtils.assertEquals(x64.calculateBinary(25), "11001");
        AssertionUtils.assertEquals(x64.calculateBinary(884), "1101110100");
        AssertionUtils.assertEquals(x64.calculateBinary(721), "1011010001");

        AssertionUtils.assertEquals(arm.calculateBinary(25), "11001");
        AssertionUtils.assertEquals(arm.calculateBinary(884), "1101110100");
        AssertionUtils.assertEquals(arm.calculateBinary(721), "1011010001");

    }
}

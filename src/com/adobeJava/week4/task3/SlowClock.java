package com.adobeJava.week4.task3;

public class SlowClock implements Clock {
    public static final long MS_INTERVAL = FastClock.MS_INTERVAL * 4;
    private long seconds = 0;

    @Override
    public void start() {
        long start = System.currentTimeMillis();
        while (true) {
            long current = System.currentTimeMillis();

            if (current - start >= MS_INTERVAL) {
                seconds++;
                start = current;
            }
        }
    }
}

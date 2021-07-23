package com.adobeJava.week2;

public class CircleProgressAware extends ProgressAware {
    private final int angle = 360;

    public static void main(String[] args) {
        CircleProgressAware circleProgressAware = new CircleProgressAware();
        circleProgressAware.showProgress(10);
    }

    @Override
    public void showProgress(int seconds) {
        showProgress();
        long initialMillis = System.currentTimeMillis();
        long startMillis = System.currentTimeMillis();

        long currentSecond = (startMillis - initialMillis) / 1000;
        while (currentSecond < seconds) {
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - startMillis >= 1000) {
                currentSecond = (currentMillis - initialMillis) / 1000;
                startMillis = currentMillis;

                final int currentProgressPercentage = (int) (this.angle * (double) currentSecond / seconds);
                System.out.println(currentProgressPercentage);
            }
        }
        System.out.println("The app has been successfully loaded");
    }
}

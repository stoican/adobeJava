package com.adobeJava.week2;


public class LineProgressAware extends ProgressAware {
    private int lineLength;

    public static void main(String[] args) {
        LineProgressAware circleProgressAware = new LineProgressAware(150);
        circleProgressAware.showProgress(0);

        ImageLoader imageLoader = new ImageLoader("https://google.com/images/image.jpg");
        imageLoader.load();
    }

    public LineProgressAware() {
        this.lineLength = 250;
    }

    public LineProgressAware(int lineLength) {
        if (lineLength <= 0) {
            throw new RuntimeException();
        }
        this.lineLength = lineLength;
    }

    @Override
    public void showProgress(int seconds) {
        if (seconds < 0) {
            throw new RuntimeException();
        }

        super.showProgress();

        long initialMillis = System.currentTimeMillis();
        long startMillis = System.currentTimeMillis();

        double currentSecond = (startMillis - initialMillis) / 500;
        while (currentSecond < seconds) {
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - startMillis >= 500) {
                currentSecond = (currentMillis - initialMillis) / 500;
                startMillis = currentMillis;
                final int currentLineHeightProgress = (int) (this.lineLength * (currentSecond / seconds));
                System.out.println(currentLineHeightProgress);
            }
        }
        System.out.println("The app has been successfully loaded");
    }
}

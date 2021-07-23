package com.adobeJava.week2;

public class ProgressAware {
    private boolean isLoading = false;

    public static void main(String[] args) {
        ProgressAware progressAware = new ProgressAware();

        progressAware.showProgress(10);

    }

    public void showProgress() {
        if (isLoading) {
            return;
        }

        this.isLoading = true;
        System.out.println("Loading: ");
    }

    public void showProgress(int seconds) {
        if (seconds < 0) {
            throw new RuntimeException();
        }

        showProgress();

        long initialMillis = System.currentTimeMillis();
        long startMillis = System.currentTimeMillis();

        long currentSecond = (startMillis - initialMillis) / 1000;
        while (currentSecond < seconds) {
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - startMillis >= 1000) {
                currentSecond = (currentMillis - initialMillis) / 1000;
                startMillis = currentMillis;
                System.out.println(currentSecond);
            }
        }
        System.out.println("The app has been successfully loaded");
        isLoading = false;

    }

    public void hideProgress() {
        this.isLoading = false;
        System.out.println("Your app has been loaded and is ready for use!");
    }

    public boolean isProgressVisible() {
        return this.isLoading;
    }

}

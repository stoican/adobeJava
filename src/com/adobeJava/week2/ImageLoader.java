package com.adobeJava.week2;

public class ImageLoader extends LineProgressAware {
    private final String url;
    private boolean isImageLoaded;


    public ImageLoader(String url) {
        if (url == null) {
            throw new RuntimeException();
        }
        this.url = url;
    }

    public ImageLoader(String url, int lineLength) {
        super(lineLength);

        if (url == null) {
            throw new RuntimeException();
        }

        this.url = url;
        super.showProgress(5);
    }

    public void load() {
        if (this.isImageLoaded) {
            return;
        }

        super.showProgress(5);
        System.out.println("Image from source url: " + url + "has been successfully loaded!");

        this.isImageLoaded = true;
    }
}

package com.model;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    String image;
    Image(String image) {
        this.image = image;
        try{
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "com.model.Image{" +
                "image='" + image + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
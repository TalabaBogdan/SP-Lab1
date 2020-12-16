package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String image;
    public Image(String image) {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
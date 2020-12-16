package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;

public class ImageProxy implements Element {
    String url;
    int dim;
    Image realimg;

    public ImageProxy(String url){
        this.url = url;
    }

    public Image loadImage(){
        if (realimg == null){
            realimg = new Image(url);
        }
        return realimg;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

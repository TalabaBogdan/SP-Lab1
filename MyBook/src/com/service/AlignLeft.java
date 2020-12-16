package com.service;

public class AlignLeft implements AlignStrategy{
    public void render(Paragraph paragraph, Context context){
        System.out.println("Align Left " + paragraph.getpText());
    }
}

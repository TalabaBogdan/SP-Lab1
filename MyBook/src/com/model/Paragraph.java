package com.model;

import com.interfaces.AlignStrategy;
import com.interfaces.Element;
import com.interfaces.Visitor;

public class Paragraph implements Element {
    String pText;
    AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.pText = text;
    }

    public void setAlignStrategy(AlignStrategy strategy){
        alignStrategy = strategy;
    }

    public String getpText() {
        return pText;
    }

    @Override
    public String toString() {
        return "com.model.Paragraph{" +
                "pText='" + pText + '\'' +
                '}';
    }

    @Override
    public void print() {
        if (alignStrategy != null){
            alignStrategy.render(this, new Context());
            return;
        }
        System.out.println(this.toString());
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setpText(String pText) {
        this.pText = pText;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }
}
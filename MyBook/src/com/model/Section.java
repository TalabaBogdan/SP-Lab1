package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String sectionTitle;
    private List<Element> content = new ArrayList<Element>();


    public Section(String title) {
        this.sectionTitle = title;
    }
    public void print() {
        System.out.println(this.sectionTitle);

        for(Element content: this.content) {
            content.print();
        }
    }

    public int add(Element element) {
        this.content.add(element);
        return this.content.size() - 1;
    }

    public void remove(Element element) {
        this.content.remove(element);
    }

    public Element getElement(int index) {
        return this.content.get(index);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public List<Element> getContent() {
        return content;
    }

    public void setContent(List<Element> content) {
        this.content = content;
    }
}
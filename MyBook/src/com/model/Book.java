package com.model;

import com.interfaces.*;

public class Book {
    private String title;
    private Author author;
    private Element elements = null;


    public Book(String title){
        this.title = title;
    }


    @Override
    public String toString() {
        return "com.model.Book{" +
                "title='" + title + '\'' +
                '}';
    }
    public void addAuthor(Author autor) {
        this.author = autor;
    }

    public void addContent(Element content) {
        this.elements = content;
    }

    public void print() {
        if(this.elements != null) {
            elements.print();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Element getElements() {
        return elements;
    }

    public void setElements(Element elements) {
        this.elements = elements;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
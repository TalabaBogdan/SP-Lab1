package com.model;

public class Book {
    private String title;
    private Author author;
    private Element elements = null;


    Book(String title){
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


}
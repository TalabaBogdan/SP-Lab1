package com.model;

public interface Visitor<T> {
    T visitBook(Book b);
    T visitSection(Section s);
    T visitTable(Table t);
    T visitParagraph(Paragraph p);
    T visitImageProxy(ImageProxy i);
    T visitImage(Image img);
}

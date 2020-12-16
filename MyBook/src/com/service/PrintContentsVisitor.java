package com.service;

import com.model.*;
import com.service.*;
import com.interfaces.*;

public class PrintContentsVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle());
        System.out.println("Authors: ");

        System.out.println("Author: " + book.getAuthor());

        System.out.println();

            castVisitor(book.getElements());

    }

    @Override
    public void visit(Section section) {
        System.out.println(section.getSectionTitle());
        for (Element e : section.getContent())
            castVisitor(e);
    }

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Paragraph text: " + paragraph.getpText());
    }

    @Override
    public void visit(ImageProxy proxy) {
        visit(proxy.loadImage());
    }

    @Override
    public void visit(Image image) {
        System.out.println("ImageName : " + image.getImage());
    }

    @Override
    public void visit(Table table) {
        System.out.println("Table name: " + table.getTable());
    }


    private void castVisitor(Element e) {
        if (e instanceof Paragraph) {
            visit((Paragraph) e);
        } else if (e instanceof ImageProxy) {
            visit((ImageProxy) e);
        } else if (e instanceof Image) {
            visit((Image) e);
        } else if (e instanceof Section) {
            visit((Section) e);
        } else if (e instanceof Table) {
            visit((Table) e);
        }
    }
}

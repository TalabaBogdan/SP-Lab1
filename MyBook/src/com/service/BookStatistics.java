package com.service;

import com.model.*;
import com.service.*;
import com.interfaces.*;

public class BookStatistics implements Visitor {
    private int countParagraph;
    private int countImage;
    private int countTables;

    @Override
    public void visit(Book book) {
        castVisitor(book.getElements());
    }

    @Override
    public void visit(Section section) {
        for (Element e : section.getContent()) {
            castVisitor(e);
        }
    }

    @Override
    public void visit(Paragraph paragraph) {
        countParagraph++;
    }

    @Override
    public void visit(ImageProxy proxy) {
        countImage++;
    }

    @Override
    public void visit(Image image) {
        countImage++;
    }

    @Override
    public void visit(Table table) {
        countTables++;
    }

    public void printCounter() {
        System.out.println("Number of paragraphs: " + countParagraph);
        System.out.println("Number of images: " + countImage);
        System.out.println("Number of tables: " + countTables);
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
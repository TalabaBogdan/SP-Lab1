package com.interfaces;

import com.model.*;
import com.service.*;


public interface Visitor {

    void visit(Book book);
    void visit(Section section);
    void visit(Paragraph paragraph);
    void visit(ImageProxy proxy);
    void visit(Image image);
    void visit(Table table);
}

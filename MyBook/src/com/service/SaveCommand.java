package com.service;

import com.interfaces.Command;
import com.model.*;
import com.utils.DocumentManager;

public class SaveCommand implements Command {
    private Section section;

    public SaveCommand(Section section) {
        this.section = section;
    }

    @Override
    public void execute() {
        Book book = DocumentManager.getDocumentManager().getBook();
        book.addContent(section);
    }
}

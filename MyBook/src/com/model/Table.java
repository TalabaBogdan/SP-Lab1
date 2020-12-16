package com.model;

import com.interfaces.Element;
import com.interfaces.Visitor;

public class Table implements Element {
    private String table;
    public Table (String table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "com.model.Table{" +
                "table='" + table + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
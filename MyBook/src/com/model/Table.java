package com.model;

public class Table implements Element {
    String table;
    Table (String table) {
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
}
package com.example.springProject.model;

public class Library {
    private int id;
    private int prn;

    public Library(int id, int prn) {
        this.id = id;
        this.prn = prn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }
}

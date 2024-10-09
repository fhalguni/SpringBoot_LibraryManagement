package com.example.springProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("ass_no")
    private int assNo;

    @JsonProperty("title")
    private String title;

    @JsonProperty("author")
    private String author;

    @JsonProperty("price")
    private int price;

    // Constructor
    public Book(int assNo, String title, String author, int price) {
        this.assNo = assNo;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public int getAssNo() {
        return assNo;
    }

    public void setAssNo(int assNo) {
        this.assNo = assNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package com.bolditsin.springMvcThymeleaf.model;

public class Book {
    private int id;
    private String title;
    private String description;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(int id, String title, String description, int year) {
        this.id = id;
        this.title= title;
        this.description = description;
        this.year = year;
    }
}

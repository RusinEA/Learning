package ru.netology.service;

public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return (title.contains(word) || author.contains(word));
    }

    public int estimatePrice() {
        if (pages <= 84) {
            return 250;
        } else {
            return pages * 250;
        }
    }

}

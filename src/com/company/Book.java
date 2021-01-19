package com.company;

import java.util.LinkedList;

public class Book {

    int bookId;
    String bookName;
    String author;
    String subject;
    int price;

    public Book(){}

    public Book(int bookId, String bookName, String author, String subject, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.subject = subject;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", price=" + price +
                '}';
    }
}

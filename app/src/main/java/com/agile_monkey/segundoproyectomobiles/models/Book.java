package com.agile_monkey.segundoproyectomobiles.models;

import java.io.Serializable;

/**
 * Created by agile-monkey-g3 on 3/14/18.
 */

public class Book implements Serializable {
    private String name;
    private String author;
    private int publicationYear;
    private String code;


    public Book(String name, String author, int publicationYear, String code) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        this.code = code;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}

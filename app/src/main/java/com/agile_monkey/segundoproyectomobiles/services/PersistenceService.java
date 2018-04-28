package com.agile_monkey.segundoproyectomobiles.services;

import com.agile_monkey.segundoproyectomobiles.models.Book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by agile-monkey-g3 on 4/14/18.
 */

public class PersistenceService {

    private static PersistenceService instance;
    private List<Book> books;
    private PersistenceService() {
        books = new ArrayList<>();
    }
    public void saveBooks(List<Book> bookList) {

    }

    List<Book> loadBooks() {
        books = new ArrayList<>();
        books.add(new Book("Call of Ctulhu","H.P. Lovecraft",1999, "2000"));
        return books;
    }
    static PersistenceService getInstance(){
        if(instance==null){
            instance = new PersistenceService();
        }
        return instance;
    }
}

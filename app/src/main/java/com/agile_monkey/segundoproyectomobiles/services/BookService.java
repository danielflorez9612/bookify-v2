package com.agile_monkey.segundoproyectomobiles.services;


import com.agile_monkey.segundoproyectomobiles.models.Book;

import java.util.List;

public class BookService {
    private static BookService instance;
    private BookService() {
    }

    public List<Book> getBooks() {
        return PersistenceService.getInstance().loadBooks();
    }
    public static BookService getInstance(){
        if(instance==null){
            instance = new BookService();
        }
        return instance;
    }
}

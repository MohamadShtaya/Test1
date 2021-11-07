package com.example.bookstore.model;

public class Bookfactory {

    public iBookDa getModel(){
        return new BookDa();
    }
}

package com.example.bookstore.model;

import java.util.List;

public interface iBookDa {
    List<Book> getBooks(String cat);
    String[] getcategories();
}

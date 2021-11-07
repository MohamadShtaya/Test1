package com.example.bookstore.model;

import java.util.ArrayList;
import java.util.List;

 class BookDa implements iBookDa {

    private ArrayList<Book> books = new ArrayList<>();
    public BookDa(){

        books.add(new Book(300,"thinking in java","java"));
        books.add(new Book(450,"prof in java","java"));
        books.add(new Book(500,"design in c#","c#"));

    }
    public List<Book> getBooks(String cat){
        ArrayList<Book> data = new ArrayList<>();
        for (Book b : books){
            if(b.getCategory().equals(cat))
                data.add(b);
        }

        return  data;

    }

     @Override
     public String[] getcategories() {
        String[] cats = new String[]{"java","c#","python"};
        return cats;
     }
 }

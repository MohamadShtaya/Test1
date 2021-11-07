package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.bookstore.model.Book;

import com.example.bookstore.model.Bookfactory;
import com.example.bookstore.model.iBookDa;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        populateSpinner();
    }

    private void populateSpinner() {
        Bookfactory factory = new Bookfactory();
        iBookDa objBook = factory.getModel();
        String[] cats = objBook.getcategories();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);
    }

    public void btnsetonclick(View view) {
        Bookfactory factory = new Bookfactory();
        iBookDa objBook = factory.getModel();
        String item = "";
        item = spinner.getSelectedItem().toString();
        List<Book> books = objBook.getBooks(item);
        String str = "";
        for (Book b:books){
            str+=b.getTitle() + "\n";

        }
        Toast.makeText(this,str, Toast.LENGTH_SHORT).show();
    }
}
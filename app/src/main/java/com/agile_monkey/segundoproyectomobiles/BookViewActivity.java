package com.agile_monkey.segundoproyectomobiles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.agile_monkey.segundoproyectomobiles.models.Book;

public class BookViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_view);
        Book book = (Book) getIntent().getSerializableExtra("book");
        TextView tvBookViewName = findViewById(R.id.tvBookViewName);
        tvBookViewName.setText(book.getName());
        TextView tvBookViewAuthor = findViewById(R.id.tvBookViewAuthor);
        tvBookViewAuthor.setText(book.getAuthor());
    }
}

package com.agile_monkey.segundoproyectomobiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.agile_monkey.segundoproyectomobiles.adapter.BookArrayAdapter;
import com.agile_monkey.segundoproyectomobiles.models.Book;
import com.agile_monkey.segundoproyectomobiles.services.BookService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> books;
    ListView listView;
    BookService bookService;

    public void refreshList(){
        books = new ArrayList<>();
        books = bookService.getBooks();
        BookArrayAdapter adapter = new BookArrayAdapter(this,books.toArray(new Book[books.size()]));
        listView.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookService = BookService.getInstance();
        listView =findViewById(R.id.listView);
        listView.setOnItemClickListener((parent, view, position, id)->{
            Book item = (Book) parent.getItemAtPosition(position);
//            Log.d("Clicked on item ",item.toString());
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        refreshList();
    }
}

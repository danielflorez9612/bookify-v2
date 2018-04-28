package com.agile_monkey.segundoproyectomobiles.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.agile_monkey.segundoproyectomobiles.BookViewActivity;
import com.agile_monkey.segundoproyectomobiles.R;
import com.agile_monkey.segundoproyectomobiles.models.Book;

import java.util.Arrays;
import java.util.logging.Logger;


/**
 * Created by agile-monkey-g3 on 3/14/18.
 */

public class BookArrayAdapter extends ArrayAdapter<Book> {
    private final Context context;
    private final Book[] values;

    public BookArrayAdapter(@NonNull Context context, Book[] values) {
        super(context,-1, values);
        this.context = context;
        this.values = values;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Book book = values[position];
        Log.d("books", Arrays.toString(values));
        LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View bookListItemView = inflater.inflate(R.layout.book_list_item,parent,false);
        bookListItemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, BookViewActivity.class);
            intent.putExtra("book",book);
            context.startActivity(intent);
        });
        TextView tvName = bookListItemView.findViewById(R.id.tvBookName);
        TextView tvAuthor = bookListItemView.findViewById(R.id.tvBookAuthor);
        ImageView imageView = bookListItemView.findViewById(R.id.bookIcon);
        CheckBox checkBox = bookListItemView.findViewById(R.id.cbBook);

        tvName.setText(book.getName());
        tvAuthor.setText(book.getAuthor());
        return bookListItemView;
    }
}

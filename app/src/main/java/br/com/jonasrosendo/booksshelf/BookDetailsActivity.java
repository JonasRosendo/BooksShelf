package br.com.jonasrosendo.booksshelf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetailsActivity extends AppCompatActivity {

    private TextView tv_title, tv_category, tv_description;
    private ImageView img_thumb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        tv_title = findViewById(R.id.tv_title);
        tv_category = findViewById(R.id.tv_category);
        tv_description = findViewById(R.id.tv_description);
        img_thumb = findViewById(R.id.img_thumb);

        Intent intent = getIntent();
        String title = intent.getExtras().getString("book_title");
        int description = intent.getExtras().getInt("book_description");
        String category = intent.getExtras().getString("book_category");
        int thumbnail = intent.getExtras().getInt("book_thumbnail");

        tv_title.setText(title);
        tv_category.setText(category);
        tv_description.setText(description);
        img_thumb.setImageResource(thumbnail);

    }
}

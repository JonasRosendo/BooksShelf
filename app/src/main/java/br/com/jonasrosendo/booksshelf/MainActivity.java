package br.com.jonasrosendo.booksshelf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList = new ArrayList<>();
        bookList.add(new Book("A garota da capa vermelha", R.string.cp_description, "Terror & Suspense", R.drawable.capa_vermelha));
        bookList.add(new Book("A garota que você deixou para trás ",R.string.deixou_pra_tras_description, "Romance", R.drawable.deixou));
        bookList.add(new Book("A sereia", R.string.sereia, "Aventura & Fantasia", R.drawable.sereia));
        bookList.add(new Book("A garota da capa vermelha", R.string.cp_description, "Terror & Suspense", R.drawable.capa_vermelha));
        bookList.add(new Book("A garota que você deixou para trás ",R.string.deixou_pra_tras_description, "Romance", R.drawable.deixou));
        bookList.add(new Book("A sereia", R.string.sereia, "Aventura & Fantasia", R.drawable.sereia));
        bookList.add(new Book("A garota da capa vermelha", R.string.cp_description, "Terror & Suspense", R.drawable.capa_vermelha));
        bookList.add(new Book("A garota que você deixou para trás ",R.string.deixou_pra_tras_description, "Romance", R.drawable.deixou));
        bookList.add(new Book("A sereia", R.string.sereia, "Aventura & Fantasia", R.drawable.sereia));
        bookList.add(new Book("A garota da capa vermelha", R.string.cp_description, "Terror & Suspense", R.drawable.capa_vermelha));
        bookList.add(new Book("A garota que você deixou para trás ",R.string.deixou_pra_tras_description, "Romance", R.drawable.deixou));
        bookList.add(new Book("A sereia", R.string.sereia, "Aventura & Fantasia", R.drawable.sereia));
        bookList.add(new Book("A garota da capa vermelha", R.string.cp_description, "Terror & Suspense", R.drawable.capa_vermelha));
        bookList.add(new Book("A garota que você deixou para trás ",R.string.deixou_pra_tras_description, "Romance", R.drawable.deixou));
        bookList.add(new Book("A sereia", R.string.sereia, "Aventura & Fantasia", R.drawable.sereia));

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new RecyclerAdapter(this, bookList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
    }

}

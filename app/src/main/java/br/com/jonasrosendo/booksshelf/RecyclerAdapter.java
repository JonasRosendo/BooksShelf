package br.com.jonasrosendo.booksshelf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder>{

    private Context context;
    private List<Book> bookList;

    public RecyclerAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_book, parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.bookTitle.setText(bookList.get(position).getTitle());
        holder.thumbnail.setImageResource(bookList.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookDetailsActivity.class);
                intent.putExtra("book_title", bookList.get(position).getTitle());
                intent.putExtra("book_thumbnail", bookList.get(position).getThumbnail());
                intent.putExtra("book_category", bookList.get(position).getCategory());
                intent.putExtra("book_description", bookList.get(position).getDescription());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView bookTitle;
        ImageView thumbnail;
        CardView cardView;

        public myViewHolder(View itemView) {
            super(itemView);

            bookTitle = itemView.findViewById(R.id.tv_book_title);
            thumbnail = itemView.findViewById(R.id.img_thumbnail);
            cardView = itemView.findViewById(R.id.CardView);
        }
    }


}

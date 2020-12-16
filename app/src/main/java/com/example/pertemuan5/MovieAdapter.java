package com.example.pertemuan5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    // atribut buat simpan data/list file
    private ArrayList<Movies> listMovie;

    // assign data ke atribute listmovie
    public void setListMovie(ArrayList<Movies> listMovie) {
        this.listMovie = listMovie;
    }

    // mencipatkan viewholder buat nampung data yang ditampilkan
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    // ikat data ke viewholder
    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movies movie = listMovie.get(position);
        Glide.with(holder.itemView.getContext())
                .load(movie.getImage())
                .into(holder.image);
        holder.name.setText(movie.getName());
        holder.desc.setText(movie.getDesc());
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name, desc;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.movie_name);
            desc = itemView.findViewById(R.id.movie_desc);
            image = itemView.findViewById(R.id.movie_image);
        }
    }

}

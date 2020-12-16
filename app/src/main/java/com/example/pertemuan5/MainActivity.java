package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovies = findViewById(R.id.rv_movies);
        MoviesData data = new MoviesData();

        MovieAdapter movieAdapter = new MovieAdapter();
        movieAdapter.setListMovie(data.getMovies());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        rvMovies.setAdapter(movieAdapter);
        rvMovies.setLayoutManager(linearLayoutManager);
    }
}
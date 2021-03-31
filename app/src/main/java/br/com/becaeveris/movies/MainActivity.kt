package br.com.becaeveris.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.becaeveris.movies.R.id.recycler_movies

class MainActivity : AppCompatActivity() {

     lateinit var recyclerMovies: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerMovies = findViewById(R.id.recycler_movies)
    }
}
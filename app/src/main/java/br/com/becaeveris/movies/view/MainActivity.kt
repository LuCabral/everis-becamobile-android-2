package br.com.becaeveris.movies.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.becaeveris.movies.R

class MainActivity : AppCompatActivity() {

    lateinit var recyclerMovies: RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
                     setContentView(R.layout.activity_main)
                recyclerMovies = findViewById(R.id.recycler_movies)
                recyclerMovies.layoutManager = LinearLayoutManager(this)
            }

    }

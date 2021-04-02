package br.com.becaeveris.movies.view

import android.graphics.Movie
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.becaeveris.movies.MoviesAdapter
import br.com.becaeveris.movies.R
import br.com.becaeveris.movies.api.APKClient
import br.com.becaeveris.movies.model.Movies

class MainActivity : AppCompatActivity() {


    lateinit var recyclerMovies: RecyclerView
    lateinit var moviesAdapter: MoviesAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            APKClient.getMovies(onSuscess = ::Moviesfetch,onError=::onError)

                recyclerMovies = findViewById(R.id.recycler_movies)
                recyclerMovies.layoutManager = LinearLayoutManager(this)
                moviesAdapter= MoviesAdapter(listOf())
                recyclerMovies.adapter=moviesAdapter
            }
                private fun Moviesfetch(movies:List<Movies>){
                    moviesAdapter.UpdateMovies(movies)
                    Toast.makeText(this,"erro", Toast.LENGTH_SHORT).show()

                }

    private fun onError(){
        Toast.makeText(this,"erro", Toast.LENGTH_SHORT).show()
    }
    }

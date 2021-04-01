package br.com.becaeveris.movies.api

import br.com.becaeveris.movies.model.Movies
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiTDm {
    @GET("3/trending/movie/week?")
fun getMovies(@Query("api_key") key: String,
              @Query ("language") language: String):
        retrofit2.Call<Movies>
}


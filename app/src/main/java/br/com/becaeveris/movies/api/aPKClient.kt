package br.com.becaeveris.movies.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retofit {

    fun init() {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

}
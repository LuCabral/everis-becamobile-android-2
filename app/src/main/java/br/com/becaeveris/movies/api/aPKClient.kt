package br.com.becaeveris.movies.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

    object  APKClient {

        var retrofit:Retrofit = Retrofit.Builder()
            .baseUrl("http://themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    const val API_KEY = "896459a21711d7425e7c042ea3e9ec67"
    const val LANGUAGE = "pt-BR"
    }
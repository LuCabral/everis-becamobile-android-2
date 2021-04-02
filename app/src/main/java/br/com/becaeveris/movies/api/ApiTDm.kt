package br.com.becaeveris.movies.api

import br.com.becaeveris.movies.model.GetMoviesResponse
import br.com.becaeveris.movies.model.Movies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiTDm {
    @GET("trending/movie/week")
fun getMovies(@Query("api_key") key: String="896459a21711d7425e7c042ea3e9ec67",
              @Query ("page") page: Int):
            Call<GetMoviesResponse>
}


package br.com.becaeveris.movies.api

import br.com.becaeveris.movies.model.GetMoviesResponse
import br.com.becaeveris.movies.model.Movies
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  APKClient {
        private val api:ApiTDm

        init {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://Api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            api=retrofit.create(ApiTDm::class.java)
             }
   fun getMovies(page:Int=1,onSuscess:(movies:List<Movies>)->Unit,onError:()->Unit){
       api.getMovies(page=page).enqueue(object:Callback<GetMoviesResponse>{
           override fun onResponse(
               call: Call<GetMoviesResponse>,
               response: Response<GetMoviesResponse>
           ) {
               if(response.isSuccessful){
          var responseBody=response.body()
               if (responseBody!=null)
               { onSuscess.invoke(responseBody.results)

               }else {

                onError.invoke()
                           }
               }
                    else{
                        onError.invoke()               }
           }

           override fun onFailure(call: Call<GetMoviesResponse>, t: Throwable) {
              onError.invoke()
           }
       }) }}


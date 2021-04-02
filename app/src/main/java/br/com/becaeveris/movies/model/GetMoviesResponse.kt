package br.com.becaeveris.movies.model

import com.google.gson.annotations.SerializedName

data class GetMoviesResponse(@SerializedName ("page"
) val page: Int,
     @SerializedName("total_pages")
     val totalpages:String,
                             @SerializedName("results")
                             val results:List<Movies>,

)
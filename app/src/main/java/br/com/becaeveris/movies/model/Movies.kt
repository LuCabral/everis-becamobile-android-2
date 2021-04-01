package br.com.becaeveris.movies.model

import android.graphics.pdf.PdfDocument
import com.google.gson.annotations.SerializedName
import retrofit2.http.GET

data class MoviesList(var results: ArrayList<Movies>?=null,var page: String?="")

data class Movies(

        @SerializedName("post_path") val poster_path:String?,
        @SerializedName ("title") val title: String?,
        @SerializedName("id") val id: Int,
        @SerializedName("overview") val overview: String?,
        @SerializedName("vote_average") val vote_overage:String?)


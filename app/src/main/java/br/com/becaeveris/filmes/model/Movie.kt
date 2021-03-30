package br.com.becaeveris.filmes.model
//recebe os dados
import com.google.gson.annotations.SerializedName

    data class Movie(
        @SerializedName("id")
        val id:String,
        @SerializedName("title")
        val title:String,
        @SerializedName("poster_path")
        val poster_path:String) {
    }







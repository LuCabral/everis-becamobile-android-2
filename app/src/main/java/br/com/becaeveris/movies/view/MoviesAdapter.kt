package br.com.becaeveris.movies

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.becaeveris.movies.model.Movies
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import okhttp3.internal.notify

class MoviesAdapter(

    private var moviesList: List<Movies>
    ) :RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent,
            false)
        return MoviesViewHolder(view)
    }

    override fun getItemCount(): Int = moviesList.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int){
        holder.bind(moviesList[position])

    }
    inner class MoviesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val posterPath: ImageView = itemView.findViewById(R.id.poster_path_img)
        fun bind(movies:Movies){
            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w342${movies.poster_path}")
                .transform(CenterCrop())
                .into(posterPath)


        }        }
    fun UpdateMovies(movies:List<Movies>){
        this.moviesList=movies
        notifyDataSetChanged()
    }

}




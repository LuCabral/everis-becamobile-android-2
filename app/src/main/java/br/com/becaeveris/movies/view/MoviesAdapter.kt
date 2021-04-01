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

class MoviesAdapter(
    private val context:Context,
    private val moviesList: List<Movies>
    ) :RecyclerView.Adapter<MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder =
        MoviesViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false))


    override fun getItemCount(): Int = moviesList.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int){
        val item = moviesList[position]
        holder.title.text = item.title
        Glide.with(context).load(item.poster_path).into(holder.poster_path)
         }

    }
    class MoviesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val poster_path: ImageView = itemView.findViewById(R.id.poster_path_img)
        val title: TextView = itemView.findViewById(R.id.title_movie_txt)

}




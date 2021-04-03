package br.com.becaeveris.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.becaeveris.movies.model.Movies
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop

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
        val item = moviesList[position]
        //item.title.also { holder.title.text = it }

    }

    class MoviesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

       private val posterPath: ImageView = itemView.findViewById(R.id.poster_path_img)
       private val title: TextView = itemView.findViewById(R.id.title)


        fun bind(movies:Movies){
                title.text = movies.title

                Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w342${movies.poster_path}")
                .transform(CenterCrop())
                .into(posterPath)
        }

   }
        fun UpdateMovies(movies:List<Movies>){
        this.moviesList=movies
        notifyDataSetChanged()
    }

}




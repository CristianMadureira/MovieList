package com.example.movielist.ui.movieList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movielist.R

class MovieListAdapter: RecyclerView.Adapter<MovieListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.adapter_movie, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.titleMovie.text = "Filme de exmplo"
    }

    override fun getItemCount(): Int {
        return 5
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val titleMovie = itemView.findViewById<TextView>(R.id.textTitleMovie)
    }
}
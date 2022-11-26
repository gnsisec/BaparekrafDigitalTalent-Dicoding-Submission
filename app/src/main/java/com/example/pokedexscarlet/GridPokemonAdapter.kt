package com.example.pokedexscarlet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridPokemonAdapter(val listPokemon: ArrayList<Pokemon>)
    : RecyclerView.Adapter<GridPokemonAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class GridViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var pokemonName: TextView = itemView.findViewById(R.id.name_pokedex_list)
        var pokemonImage: ImageView = itemView.findViewById(R.id.img_pokedex_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokedex_list, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listPokemon[position].img)
            .apply(RequestOptions().override(350,550))
            .into(holder.pokemonImage)

        holder.pokemonName.text = listPokemon[position].name

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPokemon[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listPokemon.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Pokemon)
    }
}
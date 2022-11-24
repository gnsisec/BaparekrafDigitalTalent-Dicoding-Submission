package com.example.pokedexscarlet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexscarlet.R.id.rv_pokemons

class MainActivity : AppCompatActivity() {

    private lateinit var rvPokemon: RecyclerView
    private var list_pokemon: ArrayList<Pokemon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPokemon = findViewById(rv_pokemons)
        rvPokemon.setHasFixedSize(true)

        list_pokemon.addAll(PokemonData.listPokemon)
        showPokemonList()
    }

    private fun showPokemonList() {
        rvPokemon.layoutManager = GridLayoutManager(this, 2)
        val listPokemonAdapter = GridPokemonAdapter(list_pokemon)
        rvPokemon.adapter = listPokemonAdapter
    }
}
package com.example.pokedexscarlet

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexscarlet.R.id.rv_pokemons
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class MainActivity : AppCompatActivity() {

    private lateinit var rvPokemon: RecyclerView
    private var list_pokemon: ArrayList<Pokemon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPokemon = findViewById(rv_pokemons)
        rvPokemon.setHasFixedSize(true)

        list_pokemon.addAll(PokemonData.listPokemon)
        installSplashScreen()
        showPokemonList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_me, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about_page -> {
                val aboutPageLink = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(aboutPageLink)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun showPokemonList() {
        rvPokemon.layoutManager = GridLayoutManager(this, 2)
        val listPokemonAdapter = GridPokemonAdapter(list_pokemon)
        rvPokemon.adapter = listPokemonAdapter
    }
}
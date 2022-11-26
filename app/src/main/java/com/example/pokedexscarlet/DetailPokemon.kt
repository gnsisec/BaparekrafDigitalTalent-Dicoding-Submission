package com.example.pokedexscarlet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class DetailPokemon : AppCompatActivity() {

    companion object {
        const val POKEMON_NAME = "name"
        const val POKEMON_PHOTO = "photo"
        const val POKEMON_TYPE = "type"
        const val POKEMON_DESC = "desc"
    }

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pokemon)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pokemonNameHandler: TextView = findViewById<TextView>(R.id.pokemon_name)
        val pokemonPhotoHandler: ImageView = findViewById<ImageView>(R.id.pokemon_photo)
        val pokemonTypeHandler: TextView = findViewById<TextView>(R.id.pokemon_type)
        val pokemonDescHandler: TextView = findViewById<TextView>(R.id.pokemon_desc)

        val pokemonName = intent.getStringExtra(POKEMON_NAME)
        val pokemonPhoto = intent.getIntExtra(POKEMON_PHOTO, 0)
        val pokemonType = intent.getStringExtra(POKEMON_TYPE)
        val pokemonDesc = intent.getStringExtra(POKEMON_DESC)

        pokemonNameHandler.text = pokemonName
        pokemonPhotoHandler.setImageDrawable(getDrawable(pokemonPhoto))
        pokemonTypeHandler.text = "Type: $pokemonType"
        pokemonDescHandler.text = pokemonDesc
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}

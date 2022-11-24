package com.example.pokedexscarlet

object PokemonData {
    private val pokemonNames = arrayOf(
        "Sprigatito",
        "Fuecoco",
        "Quaxly",
        "Sunkern",
        "Ralts",
        "Psyduck",
        "Meowth",
        "Eevee",
        "Growlithe",
        "Koraidon"
    )

    private val pokemonTypes = arrayOf(
        "Grass",
        "Fire",
        "Water",
        "Grass",
        "Psychic",
        "Water",
        "Normal",
        "Normal",
        "Fire",
        "Fire"
    )

    private val pokemonImages = arrayOf(
        R.drawable.sprigatito,
        R.drawable.fuecoco,
        R.drawable.quaxly,
        R.drawable.sunkern,
        R.drawable.ralts,
        R.drawable.psyduck,
        R.drawable.meowth,
        R.drawable.eevee,
        R.drawable.growlithe,
        R.drawable.koraidon
    )

    val listPokemon: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for(position in pokemonNames.indices) {
                val pokemon = Pokemon()
                pokemon.name = pokemonNames[position]
                pokemon.type = pokemonTypes[position]
                pokemon.img = pokemonImages[position]
                list.add(pokemon)
            }
            return list
        }
}
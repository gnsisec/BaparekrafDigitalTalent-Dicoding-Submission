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

    private val pokemonDesc = arrayOf(
        "Sprigatito is a Grass type Pokémon introduced in Generation 9. It is known as the Grass Cat Pokémon.",
        "Fuecoco is a Fire type Pokémon introduced in Generation 9. It is known as the Fire Croc Pokémon.",
        "Quaxly is a Water type Pokémon introduced in Generation 9. It is known as the Duckling Pokémon.",
        "Sunkern is a Grass type Pokémon introduced in Generation 2. It is known as the Seed Pokémon.",
        "Ralts is a Psychic/Fairy type Pokémon introduced in Generation 3. It is known as the Feeling Pokémon.",
        "Psyduck is a Water type Pokémon introduced in Generation 1. It is known as the Duck Pokémon.",
        "Meowth is a Normal type Pokémon introduced in Generation 1. It is known as the Scratch Cat Pokémon.",
        "Eevee is a Normal type Pokémon introduced in Generation 1. It is known as the Evolution Pokémon.",
        "Growlithe is a Fire type Pokémon introduced in Generation 1. It is known as the Puppy Pokémon.",
        "Koraidon is a Fighting/Dragon type Pokémon introduced in Generation 9. It is known as the Paradox Pokémon."
    )

    val listPokemon: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for(position in pokemonNames.indices) {
                val pokemon = Pokemon()
                pokemon.name = pokemonNames[position]
                pokemon.type = pokemonTypes[position]
                pokemon.img = pokemonImages[position]
                pokemon.desc = pokemonDesc[position]
                list.add(pokemon)
            }
            return list
        }
}
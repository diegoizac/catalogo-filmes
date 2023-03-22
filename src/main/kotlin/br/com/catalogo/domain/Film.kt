package br.com.catalogo.domain

import java.time.LocalDateTime

data class Film(
    val id: Int,
    val title: String,
    val description: String,
    val releaseYear: LocalDateTime,
    val languageId: Language,
    val originalLanguageId: Int,
    val rentalRate: Double,
    val length: Int,
    val replacementCost: Double,
    val rating: String,
    val specialFeatures: Int,
    val lastUpdate: LocalDateTime

)

val mapFilm = mutableMapOf(
    1 to Category(
        id = 1,
        name = "Ação",
        LocalDateTime.of(
            2023,
            1,
            1,
            9,
            0,
            0
        )),
    2 to Category(
        id = 2,
        name = "Comédia",
        LocalDateTime.of(
            2023,
            1,
            1,
            10,
            0,
            0
        )),
    3 to Category(
        id = 3,
        name = "Ficção",
        LocalDateTime.of(
            2023,
            1,
            1,
            11,
            0,
            0
        )),
)
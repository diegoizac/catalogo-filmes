package br.com.catalogo.domain

import java.time.LocalDateTime

data class Country(
    val id: Int,
    val name: String,
    val lastUpdate: LocalDateTime
)
val mapCountry = mutableMapOf(
    1 to Country(
        id = 1,
        name = "Brasil",
        lastUpdate =
            LocalDateTime.of(
                2023,
                1,
                1,
                9,
                0,
                0
            )
    )
)
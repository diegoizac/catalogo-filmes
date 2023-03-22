package br.com.catalogo.domain

import java.time.LocalDateTime

data class City(
    val id: Int,
    val name: String,
    val countryId: Country,
    val lastUpdated: LocalDateTime
)

val mapCity = mutableMapOf(
    1 to City(
        id = 1,
        name = "São Paulo",
        countryId = mapCountry[1]!!,
        lastUpdated = LocalDateTime.of(
            2023,
            1,
            1,
            9,
            0,
            0
        )
    ),
    2 to City(
        id = 2,
        name = "Rio de Janeiro",
        countryId = mapCountry[1]!!,
        lastUpdated = LocalDateTime.of(
            2023,
            1,
            1,
            10,
            0,
            0
        )
    ),
    3 to City(
        id = 3,
        name = "Santa Catarina",
        countryId = mapCountry[1]!!,
        lastUpdated = LocalDateTime.of(
            2023,
            1,
            1,
            11,
            0,
            0
        )
    ),
    4 to City(
        id = 4,
        name = "Minas Gerais",
        countryId = mapCountry[1]!!,
        lastUpdated = LocalDateTime.of(
            2023,
            1,
            1,
            11,
            0,
            0
        )
    )
)

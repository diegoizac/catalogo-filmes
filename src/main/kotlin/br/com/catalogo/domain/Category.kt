package br.com.catalogo.domain

import java.time.LocalDateTime

data class Category(
    val id: Int,
    val name: String,
    val lastUpdate: LocalDateTime
)
val mapCategory = mutableMapOf(
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
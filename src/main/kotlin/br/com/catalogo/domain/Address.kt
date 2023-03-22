package br.com.catalogo.domain

import java.time.LocalDateTime

data class Address(
    val id: Int,
    val name: String,
    val name2: String?,
    val district: String,
    val cityId: City,
    val postalCode: Int,
    val phone: Int,
    val lastUpdate: LocalDateTime,
    val location: String
)

val address = Address(
    id = 1,
    name = "Av Paulista",
    name2 = null,
    district = "Cerqueira Cezar",
    cityId = mapCity[1]!!,
    postalCode = 12345,
    phone = 12345678,
    lastUpdate =
        LocalDateTime.of(
            2023,
            1,
            1,
            9,
            0,
            0
        ),
    location = "Av Paulista, Cerqueira Cezar"
)

val mapAddress = mutableMapOf(
    1 to Address(
        id = 1,
        name = "Av Paulista",
        name2 = null,
        district = "Cerqueira Cezar",
        cityId = mapCity[1]!!,
        postalCode = 12345333,
        phone = 933330000,
        lastUpdate =
        LocalDateTime.of(
            2023,
            1,
            1,
            9,
            0,
            0
        ),
        location = "Av Paulista, Cerqueira Cezar"
    ),
    2 to Address(
        id = 2,
        name = "Av Brasil",
        name2 = null,
        district = "Leblon",
        cityId = mapCity[2]!!,
        postalCode = 12345444,
        phone = 944440001,
        lastUpdate =
        LocalDateTime.of(
            2023,
            1,
            1,
            10,
            0,
            0
        ),
        location = "Av Brasil, Leblon"
    ),
    3 to Address(
        id = 3,
        name = "Av Brasil",
        name2 = null,
        district = "Sambaqui",
        cityId = mapCity[3]!!,
        postalCode = 12345555,
        phone = 955550002,
        lastUpdate =
        LocalDateTime.of(
            2023,
            1,
            1,
            11,
            0,
            0
        ),
        location = "Av Brasil, Sambaqui"
    ),
)

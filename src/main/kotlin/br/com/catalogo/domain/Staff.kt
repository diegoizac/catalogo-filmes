package br.com.catalogo.domain

import java.time.LocalDateTime

data class Staff(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val addressId: Address,
    val city: City,
    val country: Country,
    val email: String,
    val storeId: Store,
    val active: Boolean,
    val username: String,
    val password: String,
    val lastUpdate: LocalDateTime
)



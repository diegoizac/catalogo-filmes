package br.com.catalogo.domain

import java.time.LocalDateTime

data class Actor(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val addressId: Int,
    val storeId: Int,
    val lastUpdate: LocalDateTime
)

fun main() {

val mapActor = mutableMapOf(
    1 to Actor(
        id = 1,
        firstName = "Bruce",
        lastName = "Wayne",
        storeId = 1,
        addressId = 1,
        lastUpdate =
        LocalDateTime.of(
            2023,
            1,
            1,
            9,
            0,
            0
        )),
    2 to Actor(
        id = 2,
        firstName = "Tony",
        lastName = "Stark",
        storeId = 1,
        addressId = 2,
        lastUpdate = LocalDateTime.of(
            2023,
            1,
            1,
            10,
            0,
            0
        )),
        3 to Actor(
            id = 3,
            firstName = "Peter",
            lastName = "Parker",
            storeId = 1,
            addressId = 3,
            lastUpdate = LocalDateTime.of(
                2023,
                1,
                1,
                11,
                0,
                0
            )
        )
)
}
/*
    //Add
    val p = Person(4, "Angelina", "Jolie")
    val p = Person(9, "Tony", "Stark", 2, 1)
    val pNome = p.nome+p.sobrenome

    //Update
    map.put(2, "uva")

    //Remove
    map.remove(1)

    //Post

    for (f in map) {
        println(f)

        if(f.key == p.id) throw Exception("Id já existe")

        val dbNome = f.value.nome+f.value.sobrenome
        if(dbNome == pNome)  throw Exception("Já existe uma pessoa com este nome")

    }

    val acharP = map.get(p.id)
    val dbNome = acharP.value.nome+acharP.value.sobrenome

    val acharEnd = mapEnd.get(p.addressId)
    val acharLoja = mapLoja.get(p.addressId)

    // GRAVAR
    if( acharP != null && (acharP.id == p.id || dbNome == pNome) ) {
        throw Exception("Pessoa já existe - não pode ser gravada")
    }

    if(acharEnd == null) throw Exception("Endereço nao existe")
    if(acharLoja == null) throw Exception("Loaj não existe")

    map.put(p.id, p)

    // Atualizar
    if( acharP != null && (acharP.id != p.id || dbNome == pNome) ) {
        throw Exception("Pessoa já existe - nao pode ser atualizada")
    }

    map.put(p.id, p)

    map.remove(p.id)

    println(map)*/



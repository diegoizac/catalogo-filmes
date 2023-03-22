package br.com.catalogo.domain

import java.time.LocalDateTime
data class Store(
    val staffList: List<Staff>,
    val id: Int,
    val managerStaffId: Staff,
    val addressId: Address,
    val lastUpdate: LocalDateTime
)
/*
val mapStore = mutableMapOf(
    1 to Store(
        1,
        mapStaff[1]!!, // A variável "mapStaff" deve ser definida em outro lugar neste programa
        mapAddress[1]!!, // A variável "mapAddress" deve ser definida em outro lugar neste programa
        LocalDateTime.of(
            2023,
            1,
            1,
            9,
            0,
            0
        )
    ),
    2 to Store(
        2,
        mapStaff[2]!!, // A variável "mapStaff" deve ser definida em outro lugar neste programa
        mapAddress[2]!!, // A variável "mapAddress" deve ser definida em outro lugar neste programa
        LocalDateTime.of(
            2023,
            2,
            2,
            10,
            0,
            0
        )
    ),
    3 to Store(
        3,
        mapStaff[3]!!, // A variável "mapStaff" deve ser definida em outro lugar neste programa
        mapAddress[3]!!, // A variável "mapAddress" deve ser definida em outro lugar neste programa
        LocalDateTime.of(
            2023,
            3,
            3,
            11,
            0,
            0
        )
    )
)*/


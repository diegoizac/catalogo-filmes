package br.com.catalogo.rest

import br.com.catalogo.domain.Staff
import br.com.catalogo.rest.exception.ResourceAlreadyExistsException

object CatalogoMap {
    private val map = mutableMapOf<Int, Staff>()
    fun save(staff: Staff) {
        if (map.containsKey(staff.id)) {
            throw ResourceAlreadyExistsException("Staff já existe com o id ${staff.id}")
        }
        if (map.values.any { it.firstName == staff.firstName && it.lastName == staff.lastName }) {
            throw ResourceAlreadyExistsException("Staff", "firstName+lastName", "${staff.firstName}+${staff.lastName}")
        }
        if (staff.id <= 0) {
            throw IllegalArgumentException("O id do Staff deve ser maior que zero")
        }
        if (!staff.firstName.matches("[a-zA-Z]+".toRegex()) || staff.firstName.length < 3) {
            throw IllegalArgumentException("O nome do Staff deve conter apenas letras e ter pelo menos 3 caracteres")
        }
        if (!staff.lastName.matches("[a-zA-Z]+".toRegex()) || staff.lastName.length < 3) {
            throw IllegalArgumentException("O sobrenome do Staff deve conter apenas letras e ter pelo menos 3 caracteres")
        }
        map[staff.id] = staff
    }

    fun update(staff: Staff) {
        if (map.values.any { it.id != staff.id && it.firstName == staff.firstName && it.lastName == staff.lastName }) {
            throw IllegalArgumentException("Já existe um Staff com o mesmo primeiro nome e sobrenome")
        }
        if (!staff.firstName.matches("[a-zA-Z]+".toRegex()) || staff.firstName.length < 3) {
            throw IllegalArgumentException("O nome do Staff deve conter apenas letras e ter pelo menos 3 caracteres")
        }
        if (!staff.lastName.matches("[a-zA-Z]+".toRegex()) || staff.lastName.length < 3) {
            throw IllegalArgumentException("O sobrenome do Staff deve conter apenas letras e ter pelo menos 3 caracteres")
        }
        map[staff.id] = staff
    }

    fun delete(id: Int) {
        map.remove(id)
    }

    fun getAll(): List<Staff> {
        return map.values.toList()
    }

    fun getById(id: Int): Staff? {
        return map[id]
    }
}

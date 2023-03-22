package br.com.catalogo.services

import br.com.catalogo.domain.Staff
import br.com.catalogo.exceptions.ResourceNotFoundException
import br.com.catalogo.repository.StaffRepository

@Service
class StaffServices(private val staffRepository: StaffRepository) {

    fun createStaff(staff: Staff): Staff {
        if (staff.id <= 0) {
            throw IllegalArgumentException("ID do funcionário inválido")
        }
        val address = staffRepository.findAddressById(staff.addressId.id)
            ?: throw ResourceNotFoundException("Endereço", "id", staff.addressId.id)
        val store = staffRepository.findStoreById(staff.storeId.id)
            ?: throw ResourceNotFoundException("Loja", "id", staff.storeId.id)
        val novoFuncionario = Staff(
            staff.id, staff.firstName, staff.lastName, address, staff.city, staff.country,
            staff.email, store, staff.active, staff.username, staff.password, staff.lastUpdate
        )
        return staffRepository.save(novoFuncionario)
    }

    fun updateStaff(staff: Staff): Staff {
        if (staff.id <= 0) {
            throw IllegalArgumentException("ID do funcionário inválido")
        }
        val funcionarioExistente = staffRepository.findById(staff.id)
            .orElseThrow { ResourceNotFoundException("Funcionário", "id", staff.id) }
        val address = staffRepository.findAddressById(staff.addressId.id)
            ?: throw ResourceNotFoundException("Endereço", "id", staff.addressId.id)
        val store = staffRepository.findStoreById(staff.storeId.id)
            ?: throw ResourceNotFoundException("Loja", "id", staff.storeId.id)
        val funcionarioAtualizado = funcionarioExistente.copy(
            firstName = staff.firstName, lastName = staff.lastName, addressId = address, city = staff.city,
            country = staff.country, email = staff.email, storeId = store, active = staff.active,
            username = staff.username, password = staff.password, lastUpdate = staff.lastUpdate
        )
        return staffRepository.save(funcionarioAtualizado)
    }

    fun deleteStaff(id: Int) {
        if (id <= 0) {
            throw IllegalArgumentException("ID do funcionário inválido")
        }
        staffRepository.deleteById(id)
    }

    fun findAllStaff(): List<Staff> {
        return staffRepository.findAll()
    }

    fun findStaffById(id: Int): Staff {
        if (id <= 0) {
            throw IllegalArgumentException("ID do funcionário inválido")
        }
        return staffRepository.findById(id)
            .orElseThrow { ResourceNotFoundException("Funcionário", "id", id) }
    }

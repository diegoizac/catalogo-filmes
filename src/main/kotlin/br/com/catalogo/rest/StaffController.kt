package br.com.catalogo.controller

import br.com.catalogo.domain.Staff
import br.com.catalogo.services.StaffServices
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/staff")
class StaffController(private val staffServices: StaffServices) {

    @PostMapping("/save")
    fun saveStaff(@RequestBody staff: Staff): Staff {
        return staffServices.save(staff)
    }

    @PutMapping("/update")
    fun updateStaff(@RequestBody staff: Staff): Staff {
        return staffServices.update(staff)
    }

    @DeleteMapping("/{id}")
    fun deleteStaff(@PathVariable("id") id: Int) {
        staffServices.delete(id)
    }

    @GetMapping("/all")
    fun getAllStaff(): List<Staff> {
        return staffServices.getAll()
    }

    @GetMapping("/{id}")
    fun getStaffById(@PathVariable("id") id: Int): Staff {
        return staffServices.getById(id)
    }
}

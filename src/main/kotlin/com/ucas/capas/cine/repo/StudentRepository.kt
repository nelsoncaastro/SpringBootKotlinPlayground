package com.ucas.capas.cine.repo

import com.ucas.capas.cine.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, Int> {
    fun findByLName(lName: String): Iterable<Student>
}
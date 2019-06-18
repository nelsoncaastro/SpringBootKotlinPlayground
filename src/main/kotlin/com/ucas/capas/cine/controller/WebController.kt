package com.ucas.capas.cine.controller

import com.ucas.capas.cine.model.Student
import com.ucas.capas.cine.repo.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController {

   @Autowired
   lateinit var repository: StudentRepository

   @RequestMapping("/save")
   fun save(): String{
      repository.save(Student(sName = "Nelson", lName = "Castro", sAge = 21))
      repository.save(Student(sName = "Alexander", lName = "Valladares", sAge = 22))
      repository.save(Student(sName = "Andres", lName = "Quijada", sAge = 21))

      return "Done"
   }

   @RequestMapping("findall")
   fun findAll() = repository.findAll()

   @RequestMapping("/findbyid/{id}")
   fun findById(@PathVariable id: Int) = repository.findById(id)

   @RequestMapping("findbylastname/{lastName}")
   fun finByLName(@PathVariable lastName: String) = repository.findByLName(lastName)
}

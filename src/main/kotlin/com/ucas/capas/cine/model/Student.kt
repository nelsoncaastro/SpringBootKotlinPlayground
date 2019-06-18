package com.ucas.capas.cine.model

import javax.persistence.*

@Entity
data class Student(
        @Id
        @GeneratedValue(generator="student_id_student_seq", strategy=GenerationType.AUTO)
        @SequenceGenerator(name="student_id_student_seq", sequenceName="public.student_id_student_seq", allocationSize=1)
        @Column(name = "id_student")
        val id: Int = 0 ,

        @Column(name = "s_name")
        val sName: String = "",

        @Column(name = "s_lname")
        val lName: String = "",

        @Column(name = "s_age")
        val sAge: Int = 0,

        @Column(name = "b_active")
        val bActivo: Boolean = false
        )

package com.Develhope.esercizioHibernate.entities;

import jakarta.persistence.*;

import java.util.List;

//@Table corrisponde a una tabella su Mysql
@Table
@Entity
public class Student {
    //strategy = GenerationType.AUTO crea l'id in automatico
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@Column specifica che quella è una colonna
    @Column(nullable = false)
    private String lastName;
    //nullable = false rende la colonna Not null
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false,unique = true)
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Enrollments> enrollments;
}

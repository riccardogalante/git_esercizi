package com.Develhope.esercizioHibernate.entities;

import jakarta.persistence.*;

@Table
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "classes_id")
    private Classes classes;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}

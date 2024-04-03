package com.Develhope.esercizioHibernate.entities;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;

}

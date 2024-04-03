package com.Develhope.Test_base_dati.entities;

import jakarta.persistence.*;

@Table
@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String email;
}

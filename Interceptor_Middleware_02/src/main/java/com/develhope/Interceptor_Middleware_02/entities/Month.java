package com.develhope.Interceptor_Middleware_02.entities;

import jakarta.persistence.*;

@Entity
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Integer monthNumber;
    @Column
    private String englishName;
    @Column
    private String italianName;
    @Column
    private String germanName;

    public Month(Long id, Integer monthNumber, String englishName, String italianName, String germanName) {
        this.id = id;
        this.monthNumber = monthNumber;
        this.englishName = englishName;
        this.italianName = italianName;
        this.germanName = germanName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(Integer monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public String getGermanName() {
        return germanName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }
}

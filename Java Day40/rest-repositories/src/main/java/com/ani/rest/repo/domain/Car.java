package com.ani.rest.repo.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Car {

    @Id
    private Long id;
    private String name;
    private String make;
    private String model;
    private LocalDate mfg;
    private Double cost;
    
}

package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comercios")
public class Comercios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMERCIO_SEQ")
    @SequenceGenerator(sequenceName = "COMERCIO_SEQ", initialValue = 1, allocationSize = 1, name = "COMERCIO_SEQ")
    @Column(unique = true)
    private Long idComercio;

    @Column(nullable = false, unique = false)
    private String nomComercio;

    @Column(nullable = false, unique = false)
    private Long aforoMaximo;
}

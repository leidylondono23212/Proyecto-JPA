package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Especializaciones")
public class Especializacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspecializacion;

    @Column(name = "ID_Profesor")
    private Integer idProfesor;

    private String nombreEspecializacion;
    private String nivelEspecializacion;
    private String institucion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Profesor", insertable = false, updatable = false)
    private Profesor profesor;
}
package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Especializaciones")
public class Especializacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEspecializacion")
    private Integer idEspecializacion;

    @Column(name = "ID_Profesor")
    private Integer idProfesor;

    @Column(name = "nombreEspecializacion")
    private String nombreEspecializacion;

    @Column(name = "nivelEspecializacion")
    private String nivelEspecializacion;

    @Column(name = "institucion")
    private String institucion;

    @ManyToOne
    @JoinColumn(name = "ID_Profesor", insertable = false, updatable = false)
    private Profesor profesor;
}

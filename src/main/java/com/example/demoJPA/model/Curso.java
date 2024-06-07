package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCurso")
    private Integer idCurso;

    @Column(name = "nombreCurso")
    private String nombreCurso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "duracion")
    private int duracion;

    @Column(name = "horario")
    private String horario;

    @ManyToOne
    @JoinColumn(name = "ID_Profesor")
    private Profesor profesor;
}


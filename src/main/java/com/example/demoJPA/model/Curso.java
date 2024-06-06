package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCurso;

    private String nombreCurso;
    private String descripcion;
    private String nivel;
    private int duracion;
    private String horario;

    @Column(name = "ID_Profesor")
    private Integer idProfesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Profesor", insertable = false, updatable = false)
    private Profesor profesor;
}

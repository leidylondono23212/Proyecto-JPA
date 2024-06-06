package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Estudiantes_Cursos")
public class EstudianteCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudianteCurso;

    private Integer idEstudiante;
    private Integer idCurso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEstudiante", insertable = false, updatable = false)
    private Estudiante estudiante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCurso", insertable = false, updatable = false)
    private Curso curso;
}
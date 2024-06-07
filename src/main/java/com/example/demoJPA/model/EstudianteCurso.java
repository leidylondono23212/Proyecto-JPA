package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Estudiantes_Cursos")
public class EstudianteCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstudianteCurso")
    private Integer idEstudianteCurso;

    @Column(name = "idEstudiante")
    private Integer idEstudiante;

    @Column(name = "idCurso")
    private Integer idCurso;

    @ManyToOne
    @JoinColumn(name = "idEstudiante", insertable = false, updatable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "idCurso", insertable = false, updatable = false)
    private Curso curso;
}

package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfesor;

    private String nombre;
    private String apellido;
    private String especialidad;
    private String certificaciones;
    private String correoElectronico;
}

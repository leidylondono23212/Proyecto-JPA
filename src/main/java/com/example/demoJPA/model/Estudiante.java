package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;

    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String telefono;
    private String direccion;
}

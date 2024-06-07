package com.example.demoJPA.repository;

import com.example.demoJPA.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    @Query(value = "SELECT e.* FROM estudiantes e INNER JOIN estudiantes_cursos ec ON e.ID_Estudiante = ec.ID_Estudiante WHERE ec.ID_Curso = ?1",
        nativeQuery = true)
    Set<Estudiante> findByCurso (Integer id);

}


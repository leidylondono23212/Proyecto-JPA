package com.example.demoJPA.repository;

import com.example.demoJPA.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
    @Query(value = "SELECT c.* FROM cursos c INNER JOIN estudiantes_cursos ec ON c.ID_Curso = ec.ID_Curso WHERE ec.ID_Estudiante = ?1",
        nativeQuery = true)
    Set<Curso> findByEstudiante (Integer id);
}

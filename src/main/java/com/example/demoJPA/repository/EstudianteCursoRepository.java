package com.example.demoJPA.repository;

import com.example.demoJPA.model.EstudianteCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteCursoRepository extends JpaRepository<EstudianteCurso, Integer> {
}

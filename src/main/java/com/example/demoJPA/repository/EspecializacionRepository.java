package com.example.demoJPA.repository;

import com.example.demoJPA.model.Especializacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EspecializacionRepository extends JpaRepository<Especializacion, Integer> {

    @Query("SELECT * FROM especializaciones WHERE ID_Profesor = :id")
    Set<Especializacion> findByProfesor(@Param("id") Integer id);
}

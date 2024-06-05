package com.example.demoJPA.repository;

import com.example.demoJPA.model.Especializacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecializacionRepository extends JpaRepository<Especializacion, Integer> {
}

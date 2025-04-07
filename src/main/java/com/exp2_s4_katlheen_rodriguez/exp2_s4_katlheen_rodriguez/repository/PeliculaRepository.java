package com.exp2_s4_katlheen_rodriguez.exp2_s4_katlheen_rodriguez.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exp2_s4_katlheen_rodriguez.exp2_s4_katlheen_rodriguez.model.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    
}
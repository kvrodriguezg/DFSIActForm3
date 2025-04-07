package com.exp2_s4_katlheen_rodriguez.exp2_s4_katlheen_rodriguez.service;
import java.util.List;
import java.util.Optional;

import com.exp2_s4_katlheen_rodriguez.exp2_s4_katlheen_rodriguez.model.Pelicula;


public interface PeliculaService {
    List<Pelicula> getAllPeliculas();
    Optional<Pelicula> getPeliculaById(Long id);
    Pelicula createPelicula(Pelicula pelicula);
    Pelicula updatePelicula(Long id, Pelicula pelicula);
    void deletePelicula (Long id);
}

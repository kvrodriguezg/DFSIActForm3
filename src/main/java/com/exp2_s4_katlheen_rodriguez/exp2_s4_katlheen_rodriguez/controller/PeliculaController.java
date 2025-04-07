package com.exp2_s4_katlheen_rodriguez.exp2_s4_katlheen_rodriguez.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exp2_s4_katlheen_rodriguez.exp2_s4_katlheen_rodriguez.model.Pelicula;
import com.exp2_s4_katlheen_rodriguez.exp2_s4_katlheen_rodriguez.service.PeliculaService;

@RestController
@RequestMapping("/peliculas")
@CrossOrigin(origins = "*")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return peliculaService.getAllPeliculas();
    }

    @GetMapping("{id}")
    public Optional<Pelicula> getPeliculaById(@PathVariable Long id){
        return peliculaService.getPeliculaById(id);
    }  
    
}

package com.example.demoJPA.controller;

import com.example.demoJPA.model.Profesor;
import com.example.demoJPA.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorRepository profesorRepository;

    @GetMapping
    public String listarProfesores(Model model) {
        List<Profesor> profesores = profesorRepository.findAll();
        model.addAttribute("profesores", profesores);
        return "profesores";
    }

    @GetMapping("/nuevo")
    public String nuevoProfesor(Model model) {
        model.addAttribute("profesor", new Profesor());
        return "formularioProfesor";
    }

    @PostMapping
    public String guardarProfesor(@ModelAttribute Profesor profesor) {
        profesorRepository.save(profesor);
        return "redirect:/profesores";
    }

    @GetMapping("/editar/{id}")
    public String editarProfesor(@PathVariable Integer id, Model model) {
        Profesor profesor = profesorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID inválido:" + id));
        model.addAttribute("profesor", profesor);
        return "formularioProfesor";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarProfesor(@PathVariable Integer id, @ModelAttribute Profesor profesor) {
        profesor.setIdProfesor(id);
        profesorRepository.save(profesor);
        return "redirect:/profesores";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProfesor(@PathVariable Integer id) {
        profesorRepository.deleteById(id);
        return "redirect:/profesores";
    }
}


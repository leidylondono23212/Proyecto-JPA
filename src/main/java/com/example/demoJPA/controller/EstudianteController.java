package com.example.demoJPA.controller;

import com.example.demoJPA.model.Estudiante;
import com.example.demoJPA.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping
    public String listarEstudiantes(Model model) {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        model.addAttribute("estudiantes", estudiantes);
        return "estudiantes";
    }

    @GetMapping("/nuevo")
    public String nuevoEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "formularioEstudiante";
    }

    @PostMapping
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteRepository.save(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/editar/{id}")
    public String editarEstudiante(@PathVariable Integer id, Model model) {
        Estudiante estudiante = estudianteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID inválido:" + id));
        model.addAttribute("estudiante", estudiante);
        return "formularioEstudiante";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarEstudiante(@PathVariable Integer id, @ModelAttribute Estudiante estudiante) {
        estudiante.setIdEstudiante(id);
        estudianteRepository.save(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Integer id) {
        estudianteRepository.deleteById(id);
        return "redirect:/estudiantes";
    }
}

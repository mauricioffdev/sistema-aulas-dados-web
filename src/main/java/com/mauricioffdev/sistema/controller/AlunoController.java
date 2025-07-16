package com.mauricioffdev.sistema.controller;

import com.mauricioffdev.sistema.model.Aluno;
import com.mauricioffdev.sistema.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoRepository.deleteById(id);
     
    }
    @GetMapping("/alunos")
public String listarAlunos(Model model) {
    List<Aluno> alunos = alunoRepository.findAll();
    model.addAttribute("alunos", alunos);
    return "alunos";
}

@GetMapping("/alunos/novo")
public String mostrarFormularioNovoAluno(Model model) {
    model.addAttribute("aluno", new Aluno());
    return "novo-aluno";
}

@GetMapping("/alunos/{id}")
public String editarAluno(@PathVariable Long id, Model model) {
    Aluno aluno = alunoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
    model.addAttribute("aluno", aluno);
    return "formulario-aluno";
}


}

package com.mauricioffdev.sistema.controller;

import com.mauricioffdev.sistema.model.Pagamento;
import com.mauricioffdev.sistema.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping
    public List<Pagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }

    @PostMapping
    public Pagamento criar(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
}

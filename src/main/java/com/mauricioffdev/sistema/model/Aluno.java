package com.mauricioffdev.sistema.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String plano;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aula> historicoAulas = new ArrayList<>();

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pagamento> pagamentos = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome, String email, String telefone, String plano) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.plano = plano;
    }

    // Getters e setters

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public List<Aula> getHistoricoAulas() {
        return historicoAulas;
    }

    public void adicionarAula(Aula aula) {
        this.historicoAulas.add(aula);
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        pagamento.setAluno(this);  // importante manter sincronizado
    }

    @Override
    public String toString() {
        return nome + " | " + plano + " | " + email + " | " + telefone;
    }

    
}

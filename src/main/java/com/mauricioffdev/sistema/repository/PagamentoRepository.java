package com.mauricioffdev.sistema.repository;

import com.mauricioffdev.sistema.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}

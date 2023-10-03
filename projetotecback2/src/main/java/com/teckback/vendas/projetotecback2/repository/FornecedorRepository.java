package com.teckback.vendas.projetotecback2.repository;

import com.teckback.vendas.projetotecback2.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

    List<Fornecedor> findByNome(String nome);
    List<Fornecedor> findAll();

    Optional<Fornecedor> findById(Long id);

    Fornecedor save(Fornecedor fornecedor);

    void deleteById(Long id);
}

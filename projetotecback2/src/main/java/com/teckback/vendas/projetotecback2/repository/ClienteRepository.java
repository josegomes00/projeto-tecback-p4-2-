package com.teckback.vendas.projetotecback2.repository;

import com.teckback.vendas.projetotecback2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeContrainsIgnoreCase(String nome);

    List<Cliente> findAll();

    List<Cliente> findByAtivo(boolean ativo);

    Optional<Cliente> findById(Long id);

    Cliente save(Cliente cliente);

    void deleteById(Long id);

}

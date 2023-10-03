package com.teckback.vendas.projetotecback2.repository;

import com.teckback.vendas.projetotecback2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAll();

    List<Produto> findByPrecoGreaterThan(Double valor);

    Optional<Produto> findById(Long id);

    Produto save(Produto produto);

    void deleteById(Long id);

}

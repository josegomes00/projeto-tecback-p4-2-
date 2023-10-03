package com.teckback.vendas.projetotecback2.service;

import com.teckback.vendas.projetotecback2.model.Produto;
import com.teckback.vendas.projetotecback2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


}
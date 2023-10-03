package com.teckback.vendas.projetotecback2.service;

import com.teckback.vendas.projetotecback2.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    public FornecedorRepository repository;
}

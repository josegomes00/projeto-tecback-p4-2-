package com.teckback.vendas.projetotecback2.service;

import com.teckback.vendas.projetotecback2.model.Cliente;
import com.teckback.vendas.projetotecback2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

}

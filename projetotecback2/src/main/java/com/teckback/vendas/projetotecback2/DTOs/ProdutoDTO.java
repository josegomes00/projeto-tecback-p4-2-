package com.teckback.vendas.projetotecback2.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTO {
    private Long id;
    private String nome;
    private double preco;


    public ProdutoDTO() {
    }

    public ProdutoDTO(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}

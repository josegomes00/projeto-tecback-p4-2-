package com.teckback.vendas.projetotecback2.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FornecedorDTO {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;


    public FornecedorDTO() {
    }


    public FornecedorDTO(Long id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}

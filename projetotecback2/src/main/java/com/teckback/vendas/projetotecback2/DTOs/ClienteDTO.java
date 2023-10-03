package com.teckback.vendas.projetotecback2.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private boolean ativo;


    public ClienteDTO() {
    }


    public ClienteDTO(Long id, String nome, String email, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
    }


}

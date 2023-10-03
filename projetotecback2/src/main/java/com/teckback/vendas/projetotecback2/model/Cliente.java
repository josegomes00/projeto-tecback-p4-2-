package com.teckback.vendas.projetotecback2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Cliente {

    @Id
    private Integer id;

    private String nome;
    private Long CPF;
    private Long NumTel;
    private String Email;

    @ManyToMany
    @JoinTable(
            name = "carrinho_compras",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> carrinhoCompras;

}

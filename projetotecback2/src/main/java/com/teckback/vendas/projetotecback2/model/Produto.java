package com.teckback.vendas.projetotecback2.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Produto implements Serializable {

    @Id
    private Long id;
    private String descricao;
    private Long preco;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;
    @ManyToMany(mappedBy = "carrinhoCompras")
    private List<Cliente> clientes;

    public Produto(String produtoB, double v) {
    }

}

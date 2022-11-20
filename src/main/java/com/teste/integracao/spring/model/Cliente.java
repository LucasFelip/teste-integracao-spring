package com.teste.integracao.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_cliente")
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable (joinColumns = @JoinColumn (name = "codigo_cliente"), inverseJoinColumns = @JoinColumn (name =" codigo_frete"))
    private List<Frete> fretes;

    @Size(max = 30)
    private String nome;

    @Size(max = 30)
    private String telefone;

    @Size(max = 30)
    private String endereco;
}
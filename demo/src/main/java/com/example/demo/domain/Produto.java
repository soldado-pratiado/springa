package com.example.demo.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Integer id;
    String nome;
    BigDecimal preco;
    Integer quantidade;
    String setor;
}

package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Produto;
import com.example.demo.repository.ProdutoRepository;

    @RestController
    @RequestMapping ("/produto")
public class ProdutoController {
      private final ProdutoRepository produtoRepository;
      public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
      }

      @PostMapping("/cadastrar")
      public void cadastrar(){

        Produto p1 = new Produto();
        p1.setNome("Leite");
        p1.setQuantidade(50);
        p1.setSetor("Alimentos");
        p1.setPreco(new BigDecimal(5.99));

        produtoRepository.save(p1);
        
      }
}

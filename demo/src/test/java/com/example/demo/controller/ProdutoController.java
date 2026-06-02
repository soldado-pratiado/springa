package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ProdutoRepository;

    @RestController
    @RequestMapping ("/produto")
public class ProdutoController {
      private final ProdutoRepository produtoRepository;
      public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
      }
}

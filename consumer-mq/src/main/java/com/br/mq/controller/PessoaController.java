package com.br.mq.controller;

import com.br.mq.repositories.PessoaRepository;
import com.br.mq.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/persons/")
public class PessoaController {

    @Autowired
    private PessoaRepository personRepository;

    @GetMapping(value = "")
    public List<Pessoa> getAll(){
        return  personRepository.findAll();
    }

}

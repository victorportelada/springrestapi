package br.fepi.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.restapi.model.contact;
import br.fepi.restapi.repository.contactRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/contatos")
public class contactController {
    
    private contactRepository repositorio;
    
    @GetMapping
    public List<contact> listar(){
        return repositorio.findAll();

    }
}

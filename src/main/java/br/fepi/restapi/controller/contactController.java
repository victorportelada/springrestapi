package br.fepi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.restapi.model.contact;
import br.fepi.restapi.repository.contactRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/contatos")
public class contactController {
    
    @Autowired
    private contactRepository repositorio;
    
    @GetMapping
    public List<contact> listar(){
        return repositorio.findAll();

    }

    @PostMapping
    public contact adicionar(@RequestBody contact contato){
        return repositorio.save(contato);

    }

    @PutMapping
    public contact alterar(@RequestBody contact contato) {
        if(contato.getId()>0)
            return repositorio.save(contato);
        return null;
    }

    public String deletar(@RequestBody contact contato) {
        if(contato.getId()>0){
            repositorio.delete(contato);
            return "Removido com sucesso";
        }
        return "Usuario nao encontrado";
    }
}

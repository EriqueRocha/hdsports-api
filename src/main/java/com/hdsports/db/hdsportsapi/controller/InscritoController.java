package com.hdsports.db.hdsportsapi.controller;

import com.hdsports.db.hdsportsapi.dto.NovoInscrito;
import com.hdsports.db.hdsportsapi.model.Inscrito;
import com.hdsports.db.hdsportsapi.repository.InscritoRepository;
import com.hdsports.db.hdsportsapi.service.InscritoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//controller vai ter o papel de delegar açgumas funções

@RestController
@RequestMapping("/inscrito") //todas as rotas feitas para esse caminho frão requisições ao banco
public class InscritoController {

    @Autowired //trazer o repositório sem necessidade de um new
    private InscritoRepository repository;

    @Autowired
    private InscritoService service;

    @GetMapping
    public List<Inscrito> findAll(){
        return repository.findAll(); //pede para o repository trazer os inscritos
    }

    @PostMapping //aceita salvar no banco de dados
    public void save(@RequestBody NovoInscrito inscrito){ // @RequestBody diz que o inscrito faz parte do corpo da requisição
        service.save(inscrito);
    }

}

package com.hdsports.db.hdsportsapi.service;

import com.hdsports.db.hdsportsapi.dto.NovoInscrito;
import com.hdsports.db.hdsportsapi.model.Eventos;
import com.hdsports.db.hdsportsapi.model.Inscrito;
import com.hdsports.db.hdsportsapi.repository.InscritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscritoService {
    @Autowired //salvamento
    private InscritoRepository repository;
    public void save(NovoInscrito novoInscrito){
        Inscrito inscrito = new Inscrito();
        inscrito.setNome(novoInscrito.getNome());
        inscrito.setCpf(novoInscrito.getCpf());
        inscrito.setDataNascimento(novoInscrito.getDataNascimento());
        inscrito.setPeso(novoInscrito.getPeso());

        repository.save(inscrito);
    }
}

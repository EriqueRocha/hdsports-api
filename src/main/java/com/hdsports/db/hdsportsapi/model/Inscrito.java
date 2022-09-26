package com.hdsports.db.hdsportsapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="tab_inscritos")
public class Inscrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private  String cpf;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataNascimento;

    @Enumerated(EnumType.STRING)
    private InscritoTipo inscritoTipo;

    @Embedded
    private Eventos eventosInscrito;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public InscritoTipo getInscritoTipo() {
        return inscritoTipo;
    }

    public void setInscritoTipo(InscritoTipo inscritoTipo) {
        this.inscritoTipo = inscritoTipo;
    }

    public Eventos getEventosInscrito() {
        return eventosInscrito;
    }

    public void setEventosInscrito(Eventos eventosInscrito) {
        this.eventosInscrito = eventosInscrito;
    }

}

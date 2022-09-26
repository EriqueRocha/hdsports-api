package com.hdsports.db.hdsportsapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_Inscrito")
public class Inscrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome_inscrito")
    private String nome;

    @Column(name="CPF_inscrito")
    private String cpf;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name="data_nascimento_inscrito")
    private LocalDateTime dataNascimento;

    @Enumerated(EnumType.STRING) //gera uma coluna de tipo que será o próprio tipo
    private InscritoTipo inscricao;

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

    public InscritoTipo getInscricao() {
        return inscricao;
    }

    public void setInscricao(InscritoTipo inscricao) {
        this.inscricao = inscricao;
    }

    public Eventos getEventosInscrito() {
        return eventosInscrito;
    }

    public void setEventosInscrito(Eventos eventosInscrito) {
        this.eventosInscrito = eventosInscrito;
    }
}

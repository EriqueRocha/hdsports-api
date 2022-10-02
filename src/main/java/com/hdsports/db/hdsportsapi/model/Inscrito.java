package com.hdsports.db.hdsportsapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Inscrito {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String peso;

    private  String cpf;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataNascimento;

    @Enumerated(EnumType.STRING)
    private InscritoTipo inscritoTipo;

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL) //um inscrito pode ter vários eventos e todas as alterações serão espelhadas para a outra tabela
    private List<Eventos> eventosInscrito;

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

    public List<Eventos> getEventosInscrito() {
        return eventosInscrito;
    }

    public void setEventosInscrito(List<Eventos> eventosInscrito) {
        this.eventosInscrito = eventosInscrito;
    }
}

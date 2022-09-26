package model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "tab_Inscrito")
public class Inscrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //diz para o banco de dados que o Postgre que vai gerar os ID
    private long numInscricao;

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


    public long getNumInscricao() {
        return numInscricao;
    }

    public void setNumInscricao(long numInscricao) {
        this.numInscricao = numInscricao;
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

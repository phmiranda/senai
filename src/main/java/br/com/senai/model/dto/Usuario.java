package br.com.senai.model.dto;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false ,updatable = false)
    private Integer id;

    @Column(name = "nome", nullable = false ,updatable = false)
    private String nome;

    @Column(name = "cpf", nullable = false ,updatable = false)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false ,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataNascimento;

    @Column(name = "sexo", nullable = false ,updatable = false)
    private Integer sexo;

    // getters e setters
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

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }
}

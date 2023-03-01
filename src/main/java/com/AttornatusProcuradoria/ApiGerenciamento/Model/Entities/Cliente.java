package com.AttornatusProcuradoria.ApiGerenciamento.Model.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String enderecoPrincipal;

    private String enderecoSecundario;

    private String dataNascimento;
    private String cidade;

    private String numero;
    private String cep;
    public String getEnderecoPrincipal() {
        return enderecoPrincipal;
    }

    public Cliente(int id, String nome, String enderecoPrincipal, String enderecoSecundario, String dataNascimento, String cidade, String numero, String cep) {
        this.id = id;
        this.nome = nome;
        this.enderecoPrincipal = enderecoPrincipal;
        this.enderecoSecundario = enderecoSecundario;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
    }

    public void setEnderecoPrincipal(String enderecoPrincipal) {
        this.enderecoPrincipal = enderecoPrincipal;
    }

    public String getEnderecoSecundario() {
        return enderecoSecundario;
    }

    public void setEnderecoSecundario(String enderecoSecundario) {
        this.enderecoSecundario = enderecoSecundario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cliente() {
    }
}

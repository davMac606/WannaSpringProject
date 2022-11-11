package com.example.wanna.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ClienteWanna")
public class Cliente {
    @Id
    @Autowired
    @Column
    int codigo;

    @Column
    String nome;
    @Column
    String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCod(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

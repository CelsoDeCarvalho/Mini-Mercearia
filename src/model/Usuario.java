package model;

import java.io.Serializable;

public class Usuario extends Pessoa implements Serializable{
    
    private String nome_usuario;
    private int id_mercearia;
    private String senha;
    private String tarefa;

    public Usuario(String nome_usuario, int id_mercearia, String senha, String tarefa, String nome, String apelido) {
        super(nome, apelido);
        this.nome_usuario = nome_usuario;
        this.id_mercearia = id_mercearia;
        this.senha = senha;
        this.tarefa = tarefa;
    }


    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public int getId_mercearia() {
        return id_mercearia;
    }

    public void setId_mercearia(int id_mercearia) {
        this.id_mercearia = id_mercearia;
    }

    
}

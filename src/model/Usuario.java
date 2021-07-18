package model;

import java.io.Serializable;

public class Usuario extends Pessoa implements Serializable{
    
    private String nome_usuario;
    private String senha;
    private boolean logado;

    public Usuario(String nome_usuario, String senha, boolean logado, String nome, String apelido) {
        super(nome, apelido);
        this.nome_usuario = nome_usuario;
        this.senha = senha;
        this.logado = logado;
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

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + getNome() + ", apelido=" + getApelido() + ", nome_usuario=" + nome_usuario + ", senha=" + senha + ", logado=" + logado + '}';
    }
    
    
    
    
}

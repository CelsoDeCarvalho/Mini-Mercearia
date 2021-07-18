package model;

import java.io.Serializable;
import java.util.List;

public class Mercearia implements Serializable{
    
    private String nome;
    private String endereco;
    private List<Usuario> usuarios;
    private List<Categoria> categorias;

    public Mercearia(String nome, String endereco, List<Usuario> usuarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.usuarios = usuarios;
        this.categorias = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Mercearia{" + "nome=" + nome + ", endereco=" + endereco + ", usuarios=" + usuarios + ", categorias=" + categorias + '}';
    }
       
}

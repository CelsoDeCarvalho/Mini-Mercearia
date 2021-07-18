package model;

import java.io.Serializable;
import java.util.List;

public class Categoria implements Serializable{
    
    private String nome;
    private String descricao;
    private List<Produto> produtos;

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nome=" + nome + ", descricao=" + descricao + ", produtos=" + produtos + '}';
    }
    
}

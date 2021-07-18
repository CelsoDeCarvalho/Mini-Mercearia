package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Produto implements Serializable{
    
    private String nome;
    private String categoria;
    private double preco;
    private float peso;
    private LocalDate data_fabrico;
    private LocalDate data_expiro;

    public Produto(String nome, String categoria, double preco, float peso, LocalDate data_fabrico, LocalDate data_expiro) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.peso = peso;
        this.data_fabrico = data_fabrico;
        this.data_expiro = data_expiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public LocalDate getData_fabrico() {
        return data_fabrico;
    }

    public void setData_fabrico(LocalDate data_fabrico) {
        this.data_fabrico = data_fabrico;
    }

    public LocalDate getData_expiro() {
        return data_expiro;
    }

    public void setData_expiro(LocalDate data_expiro) {
        this.data_expiro = data_expiro;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + ", peso=" + peso + ", data_fabrico=" + data_fabrico + ", data_expiro=" + data_expiro + '}';
    }
    
}

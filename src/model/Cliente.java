package model;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{

    public Cliente(String nome, String apelido) {
        super(nome, apelido);
    }
    
}

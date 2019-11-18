/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Autor {
    //ATRIBUTOS
    private String nome;
    private String email;
    private char sexo;
    
    //CONSTRUTORES
    //VAZIO
    public Autor() {
    }
    //CHEIO
    public Autor(String nome, String email, char sexo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
    }
    
    //GETTERS E SETTERS
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }  
}

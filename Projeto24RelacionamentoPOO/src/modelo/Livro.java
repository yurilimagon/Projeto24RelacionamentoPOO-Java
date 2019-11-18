/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author yuril
 */
public class Livro {
    //ATRIBUTOS
    private String nome;
    private double preco;
    private int qtdEstoque;
    private ArrayList<Autor> autores = new ArrayList<>();
    
    //CONSTRUTORES
    //VAZIO
    public Livro() {
    }
    //CHEIO
    public Livro(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }        
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    
    public void addAutores(Autor objAutor){
        autores.add(objAutor);
    }
    
    //MÉTODOS
    @Override
    public String toString(){
        return "Livro{" + "nome=" + nome + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + '}';
        
    }    
    public void printAutores() {
        for(int i = 0; i < autores.size(); i++){
            System.out.println("Nome: " + autores.get(i).getNome() + "\nEmail: " + autores.get(i).getEmail() +
                               "\nSexo: " + autores.get(i).getSexo() + "\n");
        }
    }
}

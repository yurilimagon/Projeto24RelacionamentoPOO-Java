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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro livro01 = new Livro();
        livro01.setNome("Vinte Mil Léguas Submarinas");
        livro01.setPreco(29.90);
        livro01.setQtdEstoque(10);
        
        Livro livro02 = new Livro();
        livro02.setNome("Anjos e Demônios");
        livro02.setPreco(19.90);
        livro02.setQtdEstoque(20);
        
        Autor autor01 = new Autor("Julio Verne", "jv@email.com",'m');
        Autor autor02 = new Autor("Dan Brown", "db@email.com",'m');
        
        livro01.addAutores(autor01);
        livro02.addAutores(autor02);
        
        System.out.println("Livro: " + livro01.getNome() + "\nPreço: " + livro01.getPreco() +
                           "\nQtd. Estoque: " + livro01.getQtdEstoque());
        livro01.printAutores();
        
        System.out.println("Livro: " + livro02.getNome() + "\nPreço: " + livro02.getPreco() +
                           "\nQtd. Estoque: " + livro02.getQtdEstoque());
        livro02.printAutores();
    }
}

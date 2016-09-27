/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;


/**
 *
 * @author Danilo Abreu
 */
public class Cliente {

    private String nome;
    private String endereco;
    private int idade;
    private static int id = 0;
    private String cpf;
   
   
    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Cliente(String nome) {
        setNome(nome);
        setId(++id);
    }

}

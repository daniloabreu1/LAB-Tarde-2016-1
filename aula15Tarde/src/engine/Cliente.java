/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class Cliente {

    private static int id = 1;
    private String nome;
    private String cpf;
    private int user;
    public static List<Cliente> lista = new ArrayList<>();

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
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

    public static int getId() {
        return id;
    }

    public Cliente() {
        setUser(id++);
    }
}

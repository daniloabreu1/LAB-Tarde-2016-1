/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.funcionario;

/**
 *
 * @author Danilo Abreu
 */
public class Gerente extends Funcionario {
    private int senha;
    
    public boolean autenticarSenha(int senha){
        if(this.getSenha()==senha){
            System.out.println("ACESSO PERMITIDO");
            return true;
        }else{
            System.out.println("ACESSO NEGADO");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
     public double getBonificacao(){
        return super.getBonificacao()+1000;
    }
}

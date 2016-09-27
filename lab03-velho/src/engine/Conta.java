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
public class Conta {
    private static int nConta=0;

    public static int getnConta() {
        return nConta;
    }

    public static void setnConta(int anConta) {
        nConta = anConta;
    }
    private double saldo;
    private double limite;
    private Cliente titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Conta(Cliente c){
        this.titular=c;
        setnConta(nConta++);
    }
}

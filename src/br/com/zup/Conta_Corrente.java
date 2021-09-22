package br.com.zup;

public class Conta_Corrente {

    String conta;
    String nome_correntista;
    double saldo;

    public  Conta_Corrente(String conta, String nome_correntista){
        this.conta=conta;
        this.nome_correntista = nome_correntista;
        saldo=0;
    }
}

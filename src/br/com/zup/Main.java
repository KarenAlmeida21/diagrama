package br.com.zup;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        // Classe Conta Corrente: Crie uma classe para construir uma conta corrente.
        //A classe deve possuir os seguintes atributos: número da conta, nome do
        //correntista e saldo. No construtor, o saldo é opcional, com valor default
        //(padrão) zero e os demais atributos são obrigatórios

Conta_Corrente santander = new Conta_Corrente("900", "ana paula");
santander.saldo=900.00;
        System.out.println(santander.saldo);
    }
};


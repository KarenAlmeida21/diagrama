package br.com.zup_ex2.lista.com;

public class Main {
    public static void main(String[] args) {
        //Crie uma classe referente à uma conta bancária, que possui como atributos o seu
        //número, saldo e o nome do correntista. Crie também o método saque() que serve
        //para retirar o certo valor do saldo, o método depósito() que serve para adicionar um
        //valor ao saldo e o método extrato() que serve para mostrar na tela o nome do
        //correntista, o número da conta e o saldo. Crie um programa principal e demonstre a
        //utilização dos métodos implementados.

        Conta_Bancaria jood = new Conta_Bancaria();
        jood.getNome_correntista("Ana");
        jood.deposito(100);
        jood.saque(50);
        jood.extrato();
    }

}

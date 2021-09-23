package br.com.zup_ex2.lista.com;

public class Conta_Bancaria {
    //Crie uma classe referente à uma conta bancária, que possui como atributos o seu
    //número, saldo e o nome do correntista. Crie também o método saque() que serve
    //para retirar o certo valor do saldo, o método depósito() que serve para adicionar um
    //valor ao saldo e o método extrato() que serve para mostrar na tela o nome do
    //correntista, o número da conta e o saldo. Crie um programa principal e demonstre a
    //utilização dos métodos implementados.
    private int numero_conta;
    private double saldo;
    private String nome_correntista;


    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public void getNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    // public void setSaldo(double saldo) {
    //  this.saldo = saldo;
    // }

    public void getSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNome_correntista(String nome_correntista) {
        this.nome_correntista = nome_correntista;
    }

    public void getNome_correntista(String nome_correntista) {
        this.nome_correntista = nome_correntista;
    }


    public void saque(double valor_saque) {
        saldo = saldo - valor_saque;
    }

    public void deposito(double valor_deposito) {
        saldo = saldo + valor_deposito;
    }

    public void extrato() {
        System.out.println("Nome: " + nome_correntista);
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de Conta: " + numero_conta);

    }
}

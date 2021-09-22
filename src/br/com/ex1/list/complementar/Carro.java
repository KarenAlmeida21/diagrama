package br.com.ex1.list.complementar;

public class Carro {
    //Crie uma classe que represente um carro, que tenha como características o
    //nome, o peso, a fabricante, a cor e o valor do carro. Crie também o método
    //darDesconto() que servirá para diminuir o preço do carro e o método pintar(), que
    //será responsável por mudar a cor do carro. Crie um carro no seu programa
    //principal, utilize os métodos criados e mostre na tela o preço e a cor do carro antes
    //e depois da utilização dos métodos.

    String nome;
    String fabricante;
    String cor;
    double peso;
    double valor;




    public Carro(String nome, String fabricante, String cor, double peso, double valor) {
        this.cor = cor;
        this.nome = nome;
        this.fabricante = fabricante;
        this.peso = peso;
        this.valor = valor;


    }



    public void dar_desconto(double desconto) {
        valor = valor - desconto;
    }

    public void pintar (String nova_cor){
        cor = nova_cor;
    }
}






package br.com.ex1.list.complementar;

public class Main {
    public static void main(String[] args) {
        Carro novo_car = new Carro("ka","fiat","preto",1000, 50000);
        novo_car.dar_desconto(5000);
        novo_car.pintar("roxo");
        System.out.println(novo_car.valor);
        System.out.println(novo_car.cor);



    }
}

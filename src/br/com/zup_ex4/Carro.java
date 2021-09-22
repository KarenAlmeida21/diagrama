package br.com.zup_ex4;

public class Carro {
    //Classe Carro: Crie uma classe para modelar um carro. Todo carro tem
    //quantidade de portas, modelo, marca e potência. No construtor, a potência é
    //opcional, com valor default (padrão) 2.0 e os demais atributos são
    //obrigatórios.
    int portas;
    String modelo;
    String marca;
    double potencia;

    public Carro(String marca, String modelo, int portas){
        this.marca=marca;
        this.modelo=modelo;
        this.portas=portas;
        potencia=2;

    }
}

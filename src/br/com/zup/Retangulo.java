package br.com.zup;

public class Retangulo {
    //Classe Retangulo: Crie uma classe que modele um retângulo:
    //1. Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e
    //Altura, a escolher)
    //2. Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular
    //Área e calcular Perímetro;
    private  double ladoA;
    private  double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB (){
        return ladoB;
    }
    public void setLadoB(double ladoB){
        this.ladoB=ladoB;
    }
    public void mudar_valor( double novo_valor_a, double novo_valor_b){
        ladoA= novo_valor_a;
        ladoB=novo_valor_b;

    }


    //metodo calculando area sem parametro
    public double calcular_area (){
       return  ladoA * ladoB;
    }

    //método sem parametro calcular perimetro(soma de todos os lados do retangulo
    public double calcular_perimetro (){
        return ladoA + ladoA + ladoB + ladoB;
    }
}

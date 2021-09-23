package br.com.zup;

public class Quadrado {
    //Classe Quadrado: Crie uma classe que modele um quadrado:
    //1. Atributos: Tamanho do lado
    //2. Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular
    //Área;
    private  double tamanho_lados;

    public void Quadrado (double tamanho_lados){
        this.tamanho_lados=tamanho_lados;
    }

    public double getTamanho_lados() {
        return tamanho_lados;
    }
    public void setTamanho_lados(double tamanho_lados){
        this.tamanho_lados=tamanho_lados;

    }

    public void mudar_valor(double novo_tamanho){
        tamanho_lados=novo_tamanho;

    }

    public double retornar (double retornar){
        return tamanho_lados;
    }
    //metodo calculando area sem parametro
    public double calculo_area (){
        return   tamanho_lados * tamanho_lados;
    }

    }





package br.com.zup.diagrama;

public class Guerreiro extends Heroi{
    private double poder_ataque;

    public Guerreiro(String nome, double vida, double poder_ataque) {
        super(nome, vida);
        this.poder_ataque = poder_ataque;
    }
}

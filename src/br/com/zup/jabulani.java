package br.com.zup;

public class jabulani {
    // Classe Bola: Crie uma chamada Jabulani
// Atributos: Cor, circunferência, material
    //Métodos: trocaCor e mostraCor
    private String cor;
    private double circuferencia;
    private String Material;


    public void jabulani() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCircuferencia() {
        return circuferencia;
    }

    public void setCircuferencia(double circuferencia) {
        this.circuferencia = circuferencia;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public void troca_cor(String nova_cor) {
        cor = nova_cor;
    }
}

package br.com.zup.diagrama;

public class Main {
    public static void main(String[] args) {
        Heroi heroi =new Heroi("blá, blá", 20);

        heroi.receber_dano(2);
        System.out.println(heroi.exibir_vida());


        //magos
        Magos mago = new Magos("maicon", 100,1000);
        mago.aplicar_magia();
        System.out.println(mago.aplicar_magia());
    }
}

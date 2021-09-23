package br.com.zup;

public class Main {

    public static void main(String[] args) {
        // Classe Conta Corrente: Crie uma classe para construir uma conta corrente.
        //A classe deve possuir os seguintes atributos: número da conta, nome do
        //correntista e saldo. No construtor, o saldo é opcional, com valor default
        //(padrão) zero e os demais atributos são obrigatórios


//classe conta corrente
        Conta_Corrente santander = new Conta_Corrente("900", "ana paula");
        santander.saldo = 900.00;
        System.out.println(santander.saldo);


        //classe jabulani
        jabulani bola = new jabulani();
        bola.setCor("roxa");
        bola.getCor();
        System.out.println(bola.getCor());

        //quadrado
        Quadrado oi = new Quadrado();
        oi.setTamanho_lados(2);
        System.out.println(oi.getTamanho_lados());

        oi.getTamanho_lados();
        oi.mudar_valor(7);

        System.out.println(oi.getTamanho_lados());
        System.out.println(oi.calculo_area());

        //retangulo
        Retangulo xabluau = new Retangulo(6,6);
        System.out.println( xabluau.getLadoA());
        xabluau.calcular_area();
        System.out.println(xabluau.calcular_area());
        System.out.println(xabluau.calcular_perimetro());
    }




};


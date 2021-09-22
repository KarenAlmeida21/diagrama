package br.com.zup_exemplo4_lista;

public class Cartao_Credito {
    //Crie uma classe que represente um cartão de crédito, que deve ter como
    //atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos
    //aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma
    //compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o
    //valor da fatura.
    double limite;
    double saldo=0;
    String nome_correntista;


    public Cartao_Credito(double limite, String nome_correntista){
        this.limite=limite;
        this.nome_correntista=nome_correntista;

    }

    public void aumenta_limite( int solicita_limite){
        limite= limite + solicita_limite;
        System.out.println("Aumento de limite liberado:");
        System.out.println("Seu atual limite é R$ " + limite);

    }
    public void diminui_limite(int reducao_limite){
        limite = limite - reducao_limite;
        System.out.println("Limite reduzido:");
        System.out.println("O seu limite atual é de R$ " + limite);
    }

    public void realiza_compra (double valor_compra){
        if(valor_compra <= limite){
            System.out.println("Compra de R$ " + valor_compra + " realizada");
            limite= limite - valor_compra;
            saldo=saldo + valor_compra;

        } else{
            System.out.println("Compra negada. Verifique seu limite.");
        }
    }

    public void imprimi_fatura(){
        System.out.println("O valor da sua fatura é R$ " + saldo);
        System.out.println("O seu limite atual é R$ " + limite);

    }
}

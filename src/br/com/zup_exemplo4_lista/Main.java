package br.com.zup_exemplo4_lista;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //Crie uma classe que represente um cartão de crédito, que deve ter como
        //atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos
        //aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma
        //compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o
        //valor da fatura.


Cartao_Credito visa = new Cartao_Credito(200,"ana");
visa.aumenta_limite(500);
visa.diminui_limite(50);
visa.realiza_compra(298.54);
visa.realiza_compra(100);


visa.imprimi_fatura();



            }
        };


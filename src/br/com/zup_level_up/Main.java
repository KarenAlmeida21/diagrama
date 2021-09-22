package br.com.zup_level_up;


import br.com.zup_ex4.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        //Classe País: Crie uma classe que modele um país, contendo nome,
        //extensão territorial e tamanho da população. No método main, crie uma lista
        //chamada continente, onde teremos uma lista de países. Adicione 4 países na
        //lista do continente (Países de sua escolha) e crie um menu para o usuário,
        //que deverá decidir se vai listar os países do continente ou sair do programa.
        // instanciando o scanner
        Scanner leitor = new Scanner(System.in);



 //instanciando o obleto
        País pais1 = new País("Brasil", "90000", "900087");
        País pais2 = new País("Canadá", "8877890", "9898787");
        País pais3 = new País("Japão", "76000", "42687");
        País pais4 = new País("Alemanha", "28560", "51387");


        //criando lista
        List<País> continente = new ArrayList<>();

        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        boolean menu = true;
        int opcao=0;

        while(menu){
            System.out.println("Digite 1 para ver a lista de países");
            System.out.println("Digite 2 para encerrar a programa");
            opcao = leitor.nextInt();
            if (opcao ==1){
                for (País referencia:continente) {
                    System.out.println(referencia.nome);
                    System.out.println(referencia.extensao_territorial);
                    System.out.println(referencia.populacao);}
                }if (opcao==2){
                System.out.println("Programa encerrado");
                menu=false;
            }else{
                System.out.println("Digite uma opção válida");
            }




        }


    }
}

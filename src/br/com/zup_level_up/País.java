package br.com.zup_level_up;

public class País {
    //Classe País: Crie uma classe que modele um país, contendo nome,
    //extensão territorial e tamanho da população. No método main, crie uma lista
    //chamada continente, onde teremos uma lista de países. Adicione 4 países na
    //lista do continente (Países de sua escolha) e crie um menu para o usuário,
    //que deverá decidir se vai listar os países do continente ou sair do programa.
    String nome;
    String extensao_territorial;
    String populacao;

    public País (String nome, String extensao_territorial, String populacao){
        this.extensao_territorial=extensao_territorial;
        this.populacao=populacao;
        this.nome=nome;
    }
}

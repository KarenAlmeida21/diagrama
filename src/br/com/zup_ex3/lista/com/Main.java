package br.com.zup_ex3.lista.com;

public class Main {
    public static void main(String[] args) {
        //Crie uma classe denominada Elevador para armazenar as informações de um
        //elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
        //total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
        //quantas pessoas estão presentes nele. A classe deve também disponibilizar os
        //seguintes métodos:
        //
        //- Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
        //houver espaço);
        //- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
        //dentro dele);
        //- Sobe : para subir um andar (não deve subir se já estiver no último andar);
        //- Desce : para descer um andar (não deve descer se já estiver no térreo);
       // Elevador edificio = new Elevador(4,20,10,5);


Elevador edificio = new Elevador(2,90,8,4);




edificio.setAndarAtual(8);
edificio.desce(-8);



    }
}

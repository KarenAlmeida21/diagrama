package br.com.zup_ex3.lista.com;


import org.w3c.dom.ls.LSOutput;

public class  Elevador {
      private   int andarAtual;
      private   int totalDeAndares;
      private   int capacidade;
      private   int qtdPessoasPresentes;



        public Elevador(int andarAtual, int totalDeAndares, int capacidade, int qtdPessoasPresentes) {
            this.andarAtual = andarAtual;
            this.totalDeAndares = totalDeAndares;
            this.capacidade = capacidade;
            this.qtdPessoasPresentes = qtdPessoasPresentes;
        }
        public void setAndarAtual(int andarAtual){
            this.andarAtual=andarAtual;
        }
public int getAndarAtual (int  andarAtual){
            return andarAtual;

}
public void setTotalDeAndares( int totalDeAndares){
            this.totalDeAndares=totalDeAndares;
}
public int getTotalDeAndares (int totalDeAndares){
            return totalDeAndares;
}
public void setCapacidade(int capacidade){
            this.capacidade=capacidade;
}
public int getCapacidade (int capacidade){
             return capacidade;
}

        public void setQtdPessoasPresentes(int qtdPessoasPresentes) {
            this.qtdPessoasPresentes = qtdPessoasPresentes;
        }

        public int getQtdPessoasPresentes (int qtdPessoasPresentes){
            return qtdPessoasPresentes;
        }

        public void entra(int qtdPessoas) {
            int totalDeViajantes = qtdPessoas + qtdPessoasPresentes;

            if (totalDeViajantes > capacidade) {
                System.out.println("O elevador não comporta tal quantidade. ");
                System.out.println("Quantidade de pessoas que excedeu: " + (totalDeViajantes - capacidade));
            } else {
                qtdPessoasPresentes = totalDeViajantes;
            }
        }

        public void sai(int qtdPessoas) {
            int totalDeViajantes = qtdPessoasPresentes - qtdPessoas;

            if (totalDeViajantes < 0) {
                System.out.println("Você não pode tirar uma quantidade maior de pessoas do que a quantidade de pessoas presentes ");
            } else {
                qtdPessoasPresentes = totalDeViajantes;
            }
        }
        //subir: criando metodo
        public void sobe (int andarDestino) {
            //  Sobe : para subir um andar (não deve subir se já estiver no último andar);
            if( andarDestino  >= totalDeAndares & andarDestino > andarAtual  ){
                System.out.println("Você está no " + andarAtual + " andar");
                System.out.println("Subindo");
                System.out.println("Você vai para o " + andarDestino + " andar");
                andarAtual=andarDestino;
            } if (andarDestino > totalDeAndares){
                System.out.println("Não é possivel ir até andar  " + andarDestino );
                System.out.println("Selecione um andar existente no edificio");
            }else if (andarDestino < andarAtual){
                System.out.println("Elevador subindo. Selecione um andar acima do seu atual ou selecione a opção descer.");
            }

        }

        public void desce (int andarDestino){
            //- Desce : para descer um andar (não deve descer se já estiver no térreo);
            if( andarDestino <  andarAtual & andarDestino > 0){
                System.out.println("Você está no " + andarAtual + " andar");
                System.out.println("Descendo");
                System.out.println("Você vai para o " + andarDestino + " andar");
                andarAtual=andarDestino;
            }
        }

    }
    // Modifique o exercício 3 da aula anterior para utilizar modificadores de acessos, getters e setters
// e também modifique o seu programa principal para se adequar à nova implementação.


package br.com.zup.diagrama;

public class Heroi {


        private String nome;
        private double vida;

       //construtor classe Heroi Padrão
        public Heroi(){

        }
        //Consytrutor classe heroi com parametros
        public Heroi(String nome, double vida){
            this.nome=nome;
            this.vida=vida;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getVida() {
            return vida;
        }

        public void setVida(double vida) {
            this.vida = vida;
        }
        //métodos d
        public void trocar_nome(String novo_nome){
            nome=novo_nome;

        }
        public void receber_dano (double dano){

            vida= vida-dano;


        }




        }
    }


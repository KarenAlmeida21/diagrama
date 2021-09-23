package br.com.zup.diagrama;

public class Magos  extends Heroi{
    private double poder_magico;


    public Magos(String nome, double vida, double poder_magico) {
        super(nome, vida);
        this.poder_magico = poder_magico;
    }



    public double getPoder_magico() {
        return poder_magico;
    }

    public void setPoder_magico(double poder_magico) {
        this.poder_magico = poder_magico;
    }


    public double getVida() {
        return super.getVida();
    }

   public double aplicar_magia (){
      double  magia=10;
      double nova_vida = getVida() - magia;
      return nova_vida;


       }
   }



package boletin3_1;

public class Coche {
    private int velocidade;

    public Coche(){
        velocidade=0;
    }
    
    //public int getVelocidade() . Este método devolve a velocidade actual
    public int getVelocidade(){
        return velocidade;
    }

    //public void acelerar (int valor) .Este método incrementa a velocidade na cantidade valor
    public void acelerar (int valor){
        velocidade += valor;
    }
    
    //public void frenar (int menos).Este método diminue a velocidade na cantidade menos.
    public void frenar (int menos){
         velocidade -= menos;
    }
}

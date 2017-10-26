package boletin3_1;

public class Boletin3_1 {

    public static void main(String[] args) {
        Coche ch1 = new Coche();
        
        System.out.println(ch1.getVelocidade());
        
        ch1.acelerar(20);
        System.out.println(ch1.getVelocidade());
        
        ch1.frenar(10);
        System.out.println(ch1.getVelocidade());
    }
    
}

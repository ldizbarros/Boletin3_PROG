package boletin3_3;

public class Boletin3_3 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRadio(5);
        System.out.println(c1.getRadio());
        
        Circulo c2 = new Circulo(6);
        System.out.println(c2.calcularArea());
        System.out.println(c2.calcularLonxitude());
    }
    
}

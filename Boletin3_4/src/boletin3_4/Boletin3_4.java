package boletin3_4;

public class Boletin3_4 {

    public static void main(String[] args) {
        Restaurante r1 = new Restaurante(5,3);
        
        r1.amosarPatacas();
        r1.amosarPolbo();
        
        System.out.println("Poden comer "+r1.numClientes(7, 10)+" persoas");
    }
    
}

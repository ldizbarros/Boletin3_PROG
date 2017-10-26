package boletin3_3;

public class Circulo {
    private double radio; 
    final static double PI=3.14;
    
    //constructores, sen e con parámetros
    public Circulo(){
        radio=0;
    }
    public Circulo(double r){
        radio=r;
    }
    
    //métodos de acceso
    public double getRadio(){
        return radio;
    }
    public void setRadio(double valor){
        radio=valor;
    }
    
    //calcularArea : Non recibe nada e devolve o valor da área . Para calcular radio ^ 2 utiliza a clase Math e o método pow (….)
    public double calcularArea(){
        return (Math.pow(radio, 2));
    }

    //calcularLonxitude : Non recibe nada e devolve o valor da lonxitude da circunferencias
    public double calcularLonxitude(){
        return (2*PI*radio);
    }
}

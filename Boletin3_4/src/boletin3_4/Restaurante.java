package boletin3_4;

public class Restaurante {
    private double polbo;
    private double patacas;
    
    //Constructor
    public Restaurante(){
        polbo = patacas = 0;
    }
    public Restaurante(double polbo, double patacas){
        this.polbo=polbo;
        this.patacas=patacas;
    }
    
    //O método recibe a cantidade de polbo e patacas, en kilos, e devolve o 
    //número de clientes que pode atender o restaurante .Tendo en conta que 
    //por cada 3 persoas , o restaurante utiliza 2 kg de polbo e 1 de patacas
    public double numClientes (double polbo,double patacas){
        double numClientesPolbo = (polbo*3)/2;
        double numClientesPatacas = (patacas*3)/1;
        double clientes = (numClientesPolbo+numClientesPatacas)/2;
        return Math.floor(clientes);
    }
    
    //public void engadirPolbo(int x ) . Engade x kg de polbo a os xa existentes
    public void engadirPolbo(int x){
        polbo+=x;
    }
    
    //public void engadirPatacas ( int x) . Engade x kg de patacas  ''       ''
    public void engadirPatacas(int x){
        patacas+=x;
    }
    
    //public void amosarPolbo( ) . Amosa por pantalla os kg de polbo que ten no almacen
    public void amosarPolbo( ){
        System.out.println("No almacen hay "+polbo+" kg de polbo");
    }
    //public void amosarPatacas ( ) .  ''        ''       ''              ''   ''    patacas   ''     ''       '' 
    public void amosarPatacas( ){
        System.out.println("No almacen hay "+patacas+" kg de patacas");
    }
}

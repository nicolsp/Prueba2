public class Television extends Electrodomestico{
  
   
    private final static int RESOLUCIONDADA=20;
     
    private int resolucion= RESOLUCIONDADA;
 
    private boolean sintonizadorTDT;

    public double precioFinal(){
       
        double valorextra=super.precioFinal();
  
        if (resolucion>40){
            valorextra+= getPrecioBase()*0.3;
        }
        if (sintonizadorTDT){
            valorextra+=50;
        }
  
        return valorextra;
    }
  
    
    public Television(){
        this(PRECIOCONSTANTE, PESODADO, CONSUMOENERGETICO, COLORUNICO, RESOLUCIONDADA, false);
    }
  
 
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICO, COLORUNICO, RESOLUCIONDADA, false);
    }
  
   
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}
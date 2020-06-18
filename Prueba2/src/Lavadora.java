
public class Lavadora extends Electrodomestico {

	private final static int CARGADADA=5;
	private int carga;
	  
	public int getCarga() {
        return carga;
    }
	
	 public double precioFinal(){
		 double valorextra=super.precioFinal();

		 if (carga>30){
	            valorextra+=50;
	        }
	  
	        return valorextra;
	    }
	 public Lavadora(){
	        this(PRECIOCONSTANTE, PESODADO, CONSUMOENERGETICO, COLORUNICO, CARGADADA);
	    }
	  
	   
	    public Lavadora(double precioBase, double peso){
	        this(precioBase, peso, CONSUMOENERGETICO, COLORUNICO, CARGADADA);
	    }
	  
	   
	    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
	        super(precioBase,peso, consumoEnergetico,color);
	        this.carga=carga;
	    }
	}
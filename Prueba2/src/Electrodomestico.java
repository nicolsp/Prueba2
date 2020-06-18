public class Electrodomestico {

	protected final static String COLORUNICO="blanco";
	protected final static char CONSUMOENERGETICO='F';
	protected final static double PRECIOCONSTANTE=100;
	protected final static double PESODADO=5;
	
	private double precioBase= PRECIOCONSTANTE;
	private String color = COLORUNICO;
	private char consumoEnergetico = CONSUMOENERGETICO;
	private double peso= PESODADO;
	
	private void comprobarColor(String color){
		   
        
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLORUNICO;
        }
          
          
    }

	
	public void comprobarConsumoEnergetico(char consumoEnergetico){
        
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMOENERGETICO;
        }
          
    }
   
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

	public double getPeso() {
		return peso;
	}
	
	
	public double precioFinal(){
        double valorextra=0;
        switch(consumoEnergetico){
            case 'A':
            	valorextra+=100;
                break;
            case 'B':
            	valorextra+=80;
                break;
            case 'C':
            	valorextra+=60;
                break;
            case 'D':
            	valorextra+=50;
                break;
            case 'E':
            	valorextra+=30;
                break;
            case 'F':
            	valorextra+=10;
                break;
        }
   

		if (peso > 80) {
			valorextra += 100;
		} else if (peso > 50) {
			valorextra += 80;
		} else if (peso > 20) {
			valorextra += 50;
		} else {
			valorextra += 10;

		}
		return precioBase+valorextra;
	}


	

public Electrodomestico() {
	 this(PRECIOCONSTANTE, PESODADO, CONSUMOENERGETICO, COLORUNICO);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, peso, CONSUMOENERGETICO, COLORUNICO);
	

	}

	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
   
}
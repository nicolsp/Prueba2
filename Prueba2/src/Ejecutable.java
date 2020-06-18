
public class Ejecutable {
	public static void main(String[] args) {
		
		Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
		
		
		listaElectrodomesticos[0]=new Electrodomestico(150000, 60, 'B', "Azul");
        listaElectrodomesticos[1]=new Lavadora(15000, 60000);
        listaElectrodomesticos[2]=new Television(25000, 8000, 'A', "Verde", 42, false);
        listaElectrodomesticos[3]=new  Television(20000, 6000, 'C', "naranja", 30, true);
        listaElectrodomesticos[4]=new Electrodomestico(35000, 2000, 'B', "blanco");
        listaElectrodomesticos[5]=new  Electrodomestico(20000, 150000);
        listaElectrodomesticos[6]=new Television(25000, 70000);
        listaElectrodomesticos[7]=new Lavadora(20000, 70000, 'A', "verde", 15000);
        listaElectrodomesticos[8]=new Electrodomestico();
        listaElectrodomesticos[9]=new Lavadora(10000, 40000, 'Z', "blanco", 40000);
		
        double totalLavadoras=0;
        double totalElectrodomesticos=0;
        double totalTelevisiones=0;
        
        
        for(int i=0;i<listaElectrodomesticos.length;i++){
        	
        	if(listaElectrodomesticos[i] instanceof Electrodomestico){
                totalElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                totalLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                totalTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
  
        System.out.println("La suma del precio de los electrodomesticos es de "+totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+totalLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+totalTelevisiones);
   
    
		
		
	}
}

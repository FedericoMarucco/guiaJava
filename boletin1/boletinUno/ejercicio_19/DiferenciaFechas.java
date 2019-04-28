package boletinUno.ejercicio_19;

import java.util.Scanner;

public class DiferenciaFechas {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);	

	int dia, mes , año;
	int diaN, mesN, añoN;
	int diferencia, diaDif, mesDif, añoDif;
	

	
	
	
	System.out.println("Ingrese la primer fecha ");
	System.out.println("Ingrese el dia: ");
	dia = keyboard.nextInt();
	System.out.println("Ingrese el mes: ");
	mes = keyboard.nextInt();
	System.out.println("Ingrese el año");
	año = keyboard.nextInt();
	 
	System.out.println("Ingrese la segunda fecha ");
	System.out.println("Ingrese el dia: ");
	diaN = keyboard.nextInt();
	System.out.println("Ingrese el mes: ");
	mesN = keyboard.nextInt();
	System.out.println("Ingrese el año");
	añoN = keyboard.nextInt();
	if (dia==diaN && mes==mesN && año==añoN) {
		System.out.println("Las fechas son iguales , no hay diferencia de dias");
	}
	if (año !=0 && añoN !=0) {
    	if (mes>=1 && mes<=12 && mesN>=1 && mesN<=12) {
    		 if (dia>=1 && dia<=30 && diaN>=1 && diaN<=30) {
    			 if (añoN > año) {
    				 añoDif = (añoN - año) * 360; 
    				 mesDif = (mesN - mes) *30;
    				 diaDif = diaN - dia;
    				 diferencia = (añoDif + mesDif + diaDif);
    				 System.out.println("La diferencia es de: " + diferencia + " " + "dias");
	              }
    			 if (añoN==año) {
    				 if (mesN>mes) { 
        				 mesDif = (mesN - mes) *30;
        				 diaDif = diaN - dia;
        				 diferencia = (mesDif + diaDif);
        				 System.out.println("La diferencia es de: " + diferencia + " " + "dias");
    				 }
    				 if (mesN==mes && dia!=diaN) {
    					 diaDif = diaN-dia;
    					 diferencia= diaDif;
    					 System.out.println("La diferencia es de: " + diferencia + " " + "dias");
    				 }
    				 if (mes>mesN) {
    					 diaDif= dia - diaN;
    					 mesDif= (mes - mesN) * 30;
    					 diferencia = (diaDif + mesDif);
    					 System.out.println("La diferencia  es de: " + diferencia + " " + "dias");
    				 }
    				 				 
    			 }
    			 if (año>añoN) {
    				 añoDif = (año - añoN) * 360; 
    				 mesDif = (mes - mesN) *30;
    				 diaDif = dia - diaN;
    				 diferencia = (añoDif + mesDif + diaDif);
    				 System.out.println("La diferencia es de: " + diferencia + " " + "dias"); 
    			 }
    		 }
    	    else {
    	    	System.out.println("Ingrese correctamente los dias");
    	     }
	    
    	}
    	else {
    		System.out.println("Ingrese correctamente los meses");
    	}
	
	}
	else {
		System.out.println("Ingrese correctamente los años");
	}
	
 }
}

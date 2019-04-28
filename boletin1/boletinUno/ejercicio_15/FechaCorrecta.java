package boletinUno.ejercicio_15;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	
	int dia,mes,año;
	
	System.out.println("Ingrese el dia: ");
	dia = keyboard.nextInt();
	System.out.println("Ingrese el mes: ");
	mes = keyboard.nextInt();
	System.out.println("Ingrese el año: ");
	año = keyboard.nextInt();
	
	    if (dia>=1 && dia<=30) {
		    if (mes>=1 && mes<= 12) {
			   if (año!=0) {
				System.out.println("La fecha es correcta");
			   }
			   else {
				   System.out.println("el año es incorrecto");
			   }
		    }
		    else {
				  System.out.println("el mes es incorrecto"); 
		    }
	    }
	    else 
	    	System.out.println("el dia es incorrecto");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}					
}
package boletinUno.ejercicio_17;

import java.util.Scanner;

public class Fecha_dia_siguiente {
	
	public static void main(String[] args) {
	
    Scanner keyboard = new Scanner(System.in);	
		
	int diaNuevo,mesNuevo,añoNuevo;
    diaNuevo=0;
    mesNuevo=0;
    añoNuevo=0;
		
	int dia, mes, año;

	System.out.println("Ingrese el dia: ");
	dia = keyboard.nextInt();
	System.out.println("Ingrese el mes: ");
	mes = keyboard.nextInt();
	System.out.println("Ingrese el año");
	año = keyboard.nextInt();
	
	if (dia>=1 && dia<=30) {
		if (dia<30) {
			diaNuevo=dia+1;
		}
		else {
			diaNuevo=1;
		}
		if (mes>=1 && mes<=12) {
			if(mes==12 && dia==30) {  
				mesNuevo = 1;
		    }
		    if (mes<=11 & dia<=29) {
		    	mesNuevo = mes;
		    } 
		    if (mes<=11 && dia==30) {
		    	mesNuevo = mes+1; 
		    }
		    if (año!=0) {
				if (mes<=12 && dia<30) {
		        		añoNuevo = año;
		        }
				if (mes<12 && dia<=30) {
					añoNuevo = año;
				}
		        else {
		        	if(mes==12 && dia==30) {
		        			añoNuevo = año+1;
		        	}
		       	}
				System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);

			}
		    
		    else {
		        	System.out.println("El año es incorrecto");
		    }
		}
		else {
			System.out.println("El mes es incorrecto");
		}
	}
	else {
		System.out.println("El dia es incorrecto");
	}
		
		
		
	

		
        
        
 
        
	
	
	}



}

package boletinUno.ejercicio_17;

import java.util.Scanner;

public class Fecha_dia_siguiente {
	
	public static void main(String[] args) {
	
    Scanner keyboard = new Scanner(System.in);	
		
	int diaNuevo,mesNuevo,a�oNuevo;
    diaNuevo=0;
    mesNuevo=0;
    a�oNuevo=0;
		
	int dia, mes, a�o;

	System.out.println("Ingrese el dia: ");
	dia = keyboard.nextInt();
	System.out.println("Ingrese el mes: ");
	mes = keyboard.nextInt();
	System.out.println("Ingrese el a�o");
	a�o = keyboard.nextInt();
	
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
		    if (a�o!=0) {
				if (mes<=12 && dia<30) {
		        		a�oNuevo = a�o;
		        }
				if (mes<12 && dia<=30) {
					a�oNuevo = a�o;
				}
		        else {
		        	if(mes==12 && dia==30) {
		        			a�oNuevo = a�o+1;
		        	}
		       	}
				System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + a�oNuevo);

			}
		    
		    else {
		        	System.out.println("El a�o es incorrecto");
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

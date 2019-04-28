package boletinUno.ejercicio_18;

import java.util.Scanner;

public class FechaUltraHeavy {

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
		
		
		if (año != 0) {
			if (mes>=1 && mes<=12) {
				if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes ==10 ||mes==12) {	
					if (dia>=1 && dia<=31) {
						if (dia>=1 && dia<=30) {
							diaNuevo= dia+1;  
							mesNuevo= mes;
							añoNuevo= año;
							System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);
						}
						if (mes==12 && dia==31) {
							diaNuevo=1;
						    mesNuevo=1;
						    añoNuevo= año+1;
						    System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);
						}
						if (dia==31 && mes!=12) {
							diaNuevo=1;
							mesNuevo= mes+1;
							añoNuevo= año;
							System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);
						}
						
					}
					else {
						System.out.println("El dia es incorrecto");
					}
				}
			   if (mes==4 || mes== 6 || mes==9 || mes==11) {
		        	if (dia>=1 && dia<30) {
		        		diaNuevo= dia+1;
		        		mesNuevo= mes;
		        		añoNuevo= año;
		        		System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);
		        	}
		        	if (dia==30) {
		        		diaNuevo= 1;
		        		mesNuevo= mes+1;
		        		añoNuevo= año;
		        		System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);
		        	}
		        	else {
		        		if (dia<1 || dia>30) {
		        			System.out.println("El dia es incorecto");
		        		}
		        		
		        	}
		            					
			   }   
			   
			   if (mes==2) {
				   if (dia>=1 && dia <28) {
					   diaNuevo= dia+1;
				       mesNuevo= mes;
				       añoNuevo= año;
				       System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);
				   }
				   if (dia==28) {
					   diaNuevo= 1;
				       mesNuevo= mes+1;
				       añoNuevo= año;
				       System.out.println("La fecha siguiente es: "+ diaNuevo + "-" + mesNuevo + "-" + añoNuevo);
				   }
				   else {
					   if (dia<1 || dia>28) {
						   System.out.println("El dia es incorrecto"); 
					   }
					   
					   
				   }
			   }
				  
		   }
		   else {
		    	System.out.println("El mes es incorrecto");
		  	}
		}
		else {
			System.out.println("El año es incorrecto");
		}
		            					

		
		
		
		
		
		
			   
	
	}
}

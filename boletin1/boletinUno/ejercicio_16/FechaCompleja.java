package boletinUno.ejercicio_16;

import java.util.Scanner;

public class FechaCompleja {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);	
		
		
		int dia,mes,año;
		
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
						                        System.out.println("La fecha es correcta");
					                     }
					                     else {
						                    System.out.println("el dia es incorrecto");
					                     }
		        
				               }
				               if (mes==4 || mes== 6 || mes==9 || mes==11) {
				            					if (dia>=1 && dia<=30) {
				            						System.out.println("La fecha es correcta");
				            					}
				            					
				            					else {
				              					    System.out.println("el dia es incorrecto");
				            								}
				              
			                   }     
				               else {
				            	   if (mes == 2) {
				            		   if (dia>=1 && dia <=28) {
				            			   System.out.println("La fecha es correcta");
				            		   }
				            		   else {
				            			   System.out.print("El dia es incorrecto");
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
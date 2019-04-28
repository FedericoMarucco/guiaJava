package boletinUno.ejercicio_5;

import java.util.Scanner;

public class Signos {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		System.out.println("Ingrese un numero: ");
		n = keyboard.nextInt();
		
		if (n!=0) {
			if (n>0) {
			System.out.println("el numero es positivo");
			         }
			else { 
			System.out.println("el numero es negativo");	
			      }
	          }           
		
	     else {
			System.out.println("el numero no tiene signo");}
	
	
		
	
	
	 
	}
 }


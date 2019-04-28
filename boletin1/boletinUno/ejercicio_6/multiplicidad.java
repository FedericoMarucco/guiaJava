package boletinUno.ejercicio_6;

import java.util.Scanner;

public class multiplicidad {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Ingrese el primer numero: ");
		n1 = keyboard.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = keyboard.nextInt();
		
		if (n1%n2==0) {
	      System.out.println("los numeros son multiplos");
		               }
		else {
		 System.out.println("los numeros no son multiplos");
		      }
	
	
	
	
	
	}

}

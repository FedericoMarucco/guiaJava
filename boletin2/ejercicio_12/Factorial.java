package ejercicio_12;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n, i;
		long factorial;
		factorial = 1;
		
		System.out.println("Ingrese un numero: ");
		n= keyboard.nextInt();
		
		for (i=1 ; i<=n ; i++) {
			factorial*=i;
		}
		
		
		System.out.print("El factorial de " + n + " " + "es" + " " + factorial);
		
		
		
		
		
		

	}

}

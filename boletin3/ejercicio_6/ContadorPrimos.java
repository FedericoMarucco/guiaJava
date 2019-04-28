package ejercicio_6;

import java.util.Scanner;

public class ContadorPrimos {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n, j, contPrimos;
		boolean esPrimo;
		contPrimos = 0;
		
		System.out.println("ingrese un numero: ");
		n = keyboard.nextInt();
		
		for (int i=2   ; i<=n ; i++) {
			esPrimo= true;
			j=2;
			
			while (j<=i-1 && esPrimo==true) {
				if (i%j==0) {
					esPrimo= false;
				}	
			j++;
			}
				
			if (esPrimo==true) {
				contPrimos++;
				System.out.println(i+(" es primo"));
			}
				
				
		}
		
		System.out.println("La cantidad de numeros primos es: " + contPrimos);
		
		
		
		
		

	}

}

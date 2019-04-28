package ejercicio_10;

import java.util.Scanner;

public class Suma_15_Num {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int i, n;
		int suma;
		suma = 0;
		
		for(i=1; i<16; i++) {
			System.out.println("Ingrese un numero: ");
			n = keyboard.nextInt();
			suma+=n;
		}
		
		System.out.println("La suma es: " + suma);
		
		
		
		

	}

}

package ejercicio_4;

import java.util.Scanner;

public class CuadradoConAsteriscos {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		System.out.println("Ingrese el numero de lado: ");
		n = keyboard.nextInt();
		
		
		for (int i =0; i<n ; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		
		for (int i=0; i<n-2;i++) {
			System.out.print("*");
			for (int j=0; j<n-2;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for (int i =0; i<n ; i++) {
			System.out.print("*");
		}
		
		
	}

}

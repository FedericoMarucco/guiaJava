package ejercicio_6;

import java.util.Scanner;

public class MostrarSuma {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		int suma;
		suma=0;
		
		System.out.println("Ingrese un numero: ");
		n = keyboard.nextInt();
		while (n!=0) {
			suma=n+suma;
			System.out.println("Ingrese otro numero: ");
			n = keyboard.nextInt();
		}
		
		System.out.println("La suma es: " + suma);
		
		

	}

}

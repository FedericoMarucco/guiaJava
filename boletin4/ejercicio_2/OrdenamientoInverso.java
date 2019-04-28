package ejercicio_2;

import java.util.Scanner;

public class OrdenamientoInverso {

	public static void main(String[] args) {

		
		Scanner keyboard = new Scanner(System.in);
		int n,i;
		int lista [] = new int [5];
			
		for ( i=0; i < lista.length; i++) {
			System.out.println("Ingrese los valores: ");
			n=keyboard.nextInt();
			lista[i]=n;
		}
		
		for ( i=4; i>=0; i--) {
			System.out.println(lista[i]);
		
		}
		
		
		

	}

}

package ejercicio_23;

import java.util.Scanner;

public class BooleanMultiplo {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		boolean es_multiplo = false;
		
		
		for (int i=1; i<6; i++) {
			System.out.println("Ingrese un numero: ");
			n = keyboard.nextInt();
			if (n%3==0) {
				es_multiplo = true;
			}
		}
	
		if (es_multiplo == true) {
			System.out.println("Si hay al menos un multiplo de tres");
		}
		else {
			System.out.println("No hay ningun multiplo de tres");
		}
	
		
		
		
		
		
		
		
		
		

	}

}

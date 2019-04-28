package ejercicio_10;

import java.util.Scanner;

import Static_Methods.StaticMethods;

public class NDesplazamiento {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int N;
		int array [] = new int [10];
		int arrayN [] = new int [10];
		
		StaticMethods.cargarArray(array);
		
		System.out.println("Ingrese la cantidad a desplazar: ");
		N= keyboard.nextInt();
			
		for (int i=0; i<array.length-N; i++) {
				arrayN[i+N] = array [i];
		}
		
		for (int i=0; i<N; i++) {
			arrayN[i] = array[array.length-N+i];			
		}
		
		StaticMethods.printArray(arrayN);
	}

}

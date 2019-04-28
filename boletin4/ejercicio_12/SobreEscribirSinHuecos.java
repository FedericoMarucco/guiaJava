package ejercicio_12;

import java.util.Scanner;

import Static_Methods.StaticMethods;

public class SobreEscribirSinHuecos {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		
		int posicion;
		int array [] = new int [10];
	
		StaticMethods.cargarArray(array);
		
		System.out.println("Ingrese la posicion a ser borrada: ");
		posicion = keyboard.nextInt();
	
		for (int i=posicion; i < array.length-1; i++) {
			array[i] = array[i+1];
		}	
		
		for (int i=0;i < array.length-1;i++) {
			System.out.println(array[i]);
		}
	
	}
	
	
	

}

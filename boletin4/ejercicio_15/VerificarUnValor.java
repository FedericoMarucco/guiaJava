package ejercicio_15;

import java.lang.reflect.Array;
import java.util.Scanner;

import Static_Methods.StaticMethods;

public class VerificarUnValor {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int array [] = new int [5]; 
		int N;
		int posicion;
		posicion = 0;
		
		StaticMethods.cargarArray(array);
		StaticMethods.OrdenarArrayCreciente(array);
		
		System.out.println("Ingrese el valor a verificar: ");
		N= keyboard.nextInt();
		
		for (int i=0; i < array.length ; i++) {
			if (array[i]== N) {
				posicion = i;
			}
		}
		
		if (posicion == 0)
			System.out.println("el valor no se encuentra");
		else
			System.out.println("El valor buscado se encuentra en la posicon: " + posicion);
	}

}

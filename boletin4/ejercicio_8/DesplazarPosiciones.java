package ejercicio_8;

import java.util.Scanner;

import Static_Methods.StaticMethods;

public class DesplazarPosiciones {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		int nValor;
		int guardar=0;
		int guardar2;
		int posicion;
		int array [] = new int [10];
		
		
		System.out.println("lenght " + array.length);

		for (int i=0; i < array.length-2; i++) {
			System.out.println("Ingrese los valores: ");
			n= keyboard.nextInt();
			array[i]= n;
		}
		
		System.out.println("Ingrese un numero: ");
		nValor = keyboard.nextInt();
		
		System.out.println("Ingrese la posicion");
		posicion = keyboard.nextInt();
		
		for (int i=posicion; i>=0 ; i--) {
			if (i==posicion) {	
				guardar= array[i];
				array [i] = nValor;
			}
			else {
				guardar2 = array [i];
				array [i] = guardar; 
				guardar = guardar2;
			}
			
		}
		
		StaticMethods.printArray(array);
	}

}

package ejercicio_11;

import java.util.Scanner;

import Static_Methods.StaticMethods;

public class CrecienteConDesplazamiento {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int n;
		int nElemento;
		int array [] = new int [10];
		int arrayN [] = new int [10];
		
	
		for (int i=0; i < array.length-5; i++) {
				System.out.println("Ingrese los valores de forma creciente: ");   //cargar array 5 elementos
				n=keyboard.nextInt();
				array [i]= n;
		}
		
		System.out.println("Ingrese el numero a posicionar: ");
		nElemento= keyboard.nextInt();
		
		int k=0;
		for (int i=0; i < array.length-5; i++) {	 
			if (nElemento >= array[i]) {
				arrayN[i] = array [i] ;
				k++;
			}
			else
				arrayN[i+1]= array[i];
		}
			
		arrayN[k]= nElemento;	
		
		
		
	StaticMethods.printArray(arrayN);
	
	}
}

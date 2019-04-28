package ejercicio_7;

import java.util.Scanner;

import Static_Methods.StaticMethods;

public class CrecienteDecrecienteDesordenado {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a [] = new int [10];
		int k = 0;
		boolean creciente = false;
		boolean decreciente = true;
		
		StaticMethods.cargarArray(a);

		for (int i=0; i < a.length-1;i++) {	    
			if (decreciente == true) {
				if (a[i]>= a[i+1]) {
					decreciente = true;
					k++;
				}	
				else {	
					decreciente = false;
					creciente = true;
					k=0;
				}						
			}
			
		}	
			
		for (int i=0; i < a.length-1;i++) {	 
			if (creciente== true) {
				if (a[i] <= a[i+1]) {
					creciente = true;
					k++;
				}	
				else {
					creciente= false;
					k=0;
				}
			}
		}
		
		if (k!=9 )
			System.out.println("Los numeros estan desordenados");
		else if (k==9 && decreciente==true ) 
				System.out.println("Los numeros estan ordenados de forma decreciente");
		else if (k==9  && creciente==true)					
				System.out.println("Los numeros estan ordenador de forma creciente");
			
	}
	
}

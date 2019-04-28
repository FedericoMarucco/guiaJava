package Static_Methods;

import java.util.Scanner;

public class StaticMethods {

	public static void printIngreseValor(String position) {
	    System.out.println("Ingrese el " + position + " numero: ");
	}
	
	public static void cargarArray (int[] arrayACargar) {
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		for (int i=0; i < arrayACargar.length; i++ ) {
			System.out.println("Ingrese un valor: ");     //carga lista
			n= keyboard.nextInt();
			arrayACargar[i] = n;
		}
	}
	
	public static void printArray (int []arrayACargar)	{
		for ( int i=0; i < arrayACargar.length; i++) {
			System.out.println(arrayACargar[i]);
		}
	}
	
	public static void OrdenarArrayCreciente (int [] arrayACargar) {
		int guardar=0;	
		
		for (int j=0; j < arrayACargar.length-1; j++ ) {
			for (int i=0; i < arrayACargar.length-1; i++ ) {
				if (arrayACargar[i]>= arrayACargar[i+1]) {
					guardar= arrayACargar[i+1];
					arrayACargar[i+1] = arrayACargar[i];
					arrayACargar[i]= guardar;
					guardar=0;
				}	
			}
		}
	
	}
	
	
	//metodos no static 
	public void cargarArrayNoStatic (int[] arrayACargar) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		for (int i=0; i < arrayACargar.length; i++ ) {
			System.out.println("Ingrese un valor: ");     //carga lista
			n= keyboard.nextInt();
			arrayACargar[i] = n;
		}
	}
	
	public void printArrayNoStatic (int []arrayACargar)	{
		for ( int i=0; i < arrayACargar.length; i++) {
			System.out.println(arrayACargar[i]);
		}
	}
	
}

package boletinUno.ejercicio_14;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		
	int nota;
	 
	 
	 System.out.println("Ingrese un valor del 1 al 10: ");
	 nota = keyboard.nextInt();
	 
	 if (1 <= nota && nota <= 6) {
		 System.out.println("Insuficiente");
	 }
	 
	 if (nota==7) {
		 System.out.println("Suficiente");
	
	 }
	 
	 
	 if (nota>7 && nota <= 10) {
		 System.out.println("Bueno");
	 }
	 
	 
	 
	}

}

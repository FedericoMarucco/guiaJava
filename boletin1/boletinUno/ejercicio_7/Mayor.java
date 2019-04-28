package boletinUno.ejercicio_7;

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

		int n1,n2;
		
		System.out.println("Ingrese el primer numero: ");
		n1 = keyboard.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = keyboard.nextInt();
		
		
		if (n1>n2)
           System.out.println("el mayor es n1: "+n1);
	
		else
			System.out.println("el mayor es n2: "+n2);
	
	
	
	
	}

}

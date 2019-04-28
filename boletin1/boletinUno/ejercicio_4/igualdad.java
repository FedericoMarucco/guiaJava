package boletinUno.ejercicio_4;

import java.util.Scanner;

public class igualdad {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
        int n1,n2;
        
        System.out.println("Ingrese el primer numero: ");
        n1 = keyboard.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = keyboard.nextInt();
        
        if (n1==n2) 
        	System.out.println("Los numeros son iguales");
        	else
        		System.out.println("Los numeros son distintos");
        	
        
	
	
	
	}

}

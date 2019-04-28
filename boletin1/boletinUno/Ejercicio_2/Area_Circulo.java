package boletinUno.Ejercicio_2;

import java.util.Scanner;

public class Area_Circulo {

	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
        double r,A;
        System.out.println("Ingrese el radio :");
        r = keyboard.nextDouble(); 
        A = Math.PI*r*r;
         
        System.out.println("El area es: " +A);
        System.out.println("El area de una circunferencia de radio "+r+" "+ "es: "+A);
	}

}

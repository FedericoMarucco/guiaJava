package ejercicio_14;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int sueldos,i,suma, contador;
		suma=0;
		contador=0;
		
		
		
		for (i=1 ; i<=10 ; i++) {
			System.out.println("Ingrese un sueldo: ");
			sueldos = keyboard.nextInt();
			suma += sueldos;
			if (sueldos>1000) {
				contador++;
			}
		}
		System.out.println("La suma total es: " + suma + " " + "Y hay" + " " + contador + " " + "mayores a 1000 euros");

	}
               
}

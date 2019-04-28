package ejercicio1;

import java.util.Scanner;

public class asdasd1 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		
		int num;
		int cuadrado;
		
	
		System.out.println("ingrese un numero: ");
		num = keyboard.nextInt();
		
		
		while (num>=0) {
			cuadrado = num*num; 
			System.out.println("Su cuadrado es: " + cuadrado);
			System.out.println("ingrese un numero: ");
			num = keyboard.nextInt();
		}
		
 }
}
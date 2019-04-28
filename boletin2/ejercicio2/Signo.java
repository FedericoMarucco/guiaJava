package ejercicio2;

import java.util.Scanner;

public class Signo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int num;
		System.out.println("ingrese un numero: ");
		num = keyboard.nextInt();
		
		while (num!=0) {
			if (num>0) {
				System.out.println("El numero es positivo: ");
				System.out.println("ingrese otro numero: ");
				num = keyboard.nextInt();
			}
			else {
				System.out.println("El numero es negativo: ");
				System.out.println("ingrese otro numero: ");
				num = keyboard.nextInt();
			}
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}

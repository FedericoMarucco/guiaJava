package ejercicio_3;

import java.util.Scanner;

public class Paridad {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		int num;
		System.out.println("ingrese un numero: ");
		num = keyboard.nextInt();
		
		while (num!=0) {
			if (num%2==0) {
				System.out.println("El numero es par: ");
				System.out.println("ingrese otro numero: ");
				num = keyboard.nextInt();
			}
			else {
				System.out.println("El numero es impar: ");
				System.out.println("ingrese otro numero: ");
				num = keyboard.nextInt();
			}
		
		}

		

	}

}

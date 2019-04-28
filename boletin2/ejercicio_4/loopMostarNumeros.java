package ejercicio_4;

import java.util.Scanner;

public class loopMostarNumeros {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int num, contador;
		contador = 0;
		System.out.println("ingrese un numero: ");
		num = keyboard.nextInt();
		
		
		while (num>0) {
			contador++;
			System.out.println("ingrese un numero: ");
			num = keyboard.nextInt();
		}
		
		System.out.println("Se introdujeron: " + contador + " " +"numeros");
		
		
		

	}

}

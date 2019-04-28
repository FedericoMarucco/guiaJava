package ejercicio_4;

import java.util.Scanner;

public class OdenamientoRaro {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int i, n;
		int lista [] = new int [10];
		int tamanioLista = lista.length;

		for (i=0; i <lista.length; i++) {
			System.out.println("Ingrese un valor: ");
			n = keyboard.nextInt();
			lista[i] = n;
		}

		
		for (i = 0; i < tamanioLista; i++) {

				System.out.println(lista[i]);
				System.out.println(lista[--tamanioLista]);

		}
		
	}

}

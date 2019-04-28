package ejercicio_16;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int n;
		System.out.println("Ingrese un numero: ");
		n = keyboard.nextInt();
		
		if (n>=0 && n<=10) {
			for (int i=1; i<=10 ; i++) {
				System.out.println(n + "x" + i+" "+ "=" + " "+n*i);
			}
		}
		
	}

}

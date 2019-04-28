package ejercicio_8;

import java.util.Scanner;

public class Mostrar_Num_Del_1_Al_N {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int N;
	    int i;
		System.out.println("Ingrese un numero: ");
		N= keyboard.nextInt();
		
		if (N>1) {
			for (i=1; i<=N ; i++) {
			System.out.println(i);
			}
		
		}
		
		
		
		
		
	}

}

package ejercicio_5;

import java.util.Scanner;

public class MezclarListas {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int j,i, n;
		int listaA [] = new int [3];
		int listaB []= new int [3];
		int listaC []= new int [6];
		
		j=0;
		
		for (i=0; i <listaA.length; i++) {
			
			System.out.println("Ingrese un valor de la lista A: ");
			n = keyboard.nextInt();
			listaA[i] = n;
			listaC[j]= listaA[i];
			j++;
			
			System.out.println("Ingrese un valor de la lista B: ");
			n = keyboard.nextInt();
			listaB[i] = n;
			listaC[j]= listaB[i];
			j++;
		}
		
		for (j=0; j <listaC.length; j++) {
			System.out.println(listaC[j]);
		}
				
	}

}

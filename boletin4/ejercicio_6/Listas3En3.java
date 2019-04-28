package ejercicio_6;

import java.util.Scanner;

public class Listas3En3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int j, i, k, n;
		int listaA [] = new int [3];
		int listaB []= new int [3];
		int listaC []= new int [6];

		for (i=0; i <listaA.length; i++) {
			
			System.out.println("Ingrese un valor de la lista A: ");
			n = keyboard.nextInt();
			listaA[i] = n;
			
			System.out.println("Ingrese un valor de la lista B: ");
			n = keyboard.nextInt();
			listaB[i] = n;
		
		}
		
		j=0;
		k=0;
		
		 for (i=0; i <listaA.length;) {
			 listaC[j]= listaA[i++];
			 j++;
			 listaC[j]= listaA[i++];
			 j++;
			 listaC[j]= listaA[i++];
			 j++;
			 
			 listaC[j++]= listaB[k++];
			 listaC[j++]= listaB[k++];
			 listaC[j++]= listaB[k++];

		 }
	 
		
		 for (j=0; j<listaC.length;j++){
			 System.out.println(listaC[j]);
		 }
		 
	}

}

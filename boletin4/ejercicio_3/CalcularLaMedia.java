package ejercicio_3;

import java.util.Scanner;

public class CalcularLaMedia {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n,i;
		int lista [] = new int [5];
		double mediaN, mediaP, sumaP, sumaN;
		int contP, contN, contCeros;
		
		contP= 1;
		contN= 1;
		contCeros= 0;
		mediaP= 0;
		mediaN= 0;
		sumaP= 0;
		sumaN= 0;
		
		for ( i=0; i < lista.length; i++) {
			System.out.println("Ingrese los valores: ");
			n=keyboard.nextInt();
			lista[i]=n;
		}
		
		
		for (i=0; i < lista.length; i++) {
			if (lista[i]==0) {
				contCeros++;
			}
			else {
				if (lista[i]>0) {
					sumaP += lista [i];                             
					mediaP = ((double)sumaP)/contP;
					contP++;
				}
				else {
					sumaN += lista [i];                             
					mediaN = ((double)sumaN)/contN;
					contN++;
				}
			}
		}
		System.out.println("La media positiva es: " + mediaP + " " + "La media negativa es: " + mediaN + " " + "La cantidad cantidad de ceros es: " + contCeros);
	}

}

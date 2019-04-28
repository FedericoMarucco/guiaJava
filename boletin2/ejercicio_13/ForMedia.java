package ejercicio_13;

import java.util.Scanner;

public class ForMedia {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		int n, i;
		int contadorP, contadorN, cantCeros;
		double sumaN, sumaP;
		double mediaP, mediaN;
		sumaN=0;
		sumaP=0;
		contadorP=1;
		contadorN=1;
		mediaP=0;
		mediaN=0;
		cantCeros=0;
		for(i=1; i<=10 ; i++) {
			System.out.println("Ingrese un numero: ");
			n= keyboard.nextInt();
			if (n>0) {
				sumaP += n;                             
				mediaP = ((double)sumaP)/contadorP;
				contadorP++;
			}
			else if (n==0) {
				cantCeros++;
			}
			else {
				sumaN += n;                             
				mediaN =((double) sumaN)/contadorN;
				contadorN++;
			}
		}
		
		System.out.println("La media positiva es: " + mediaP + " " + "La media negativa es: " + mediaN + " " + "La cantidad cantidad de ceros es: " + cantCeros);	
		
		
		
		
		
		

	}

}

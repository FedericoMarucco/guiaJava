package ejercicio_20;

import java.util.Scanner;

public class SueldoMax {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int N, sueldoMayor;
		int sueldito;
		System.out.println("Ingrese el numero de sueldos: ");
		N = keyboard.nextInt();
		sueldoMayor=0;
		
		
		
		
		for (int i=1; i<=N ; i++ ) {
			
			System.out.println("Ingrese un sueldo: ");
			sueldito= keyboard.nextInt();
			
			while(sueldito <= 0) {
				System.out.println("Numero negativo, ingrese otro: ");
				sueldito= keyboard.nextInt();
				
			}
			 
			if (sueldito>sueldoMayor) {
					sueldoMayor = sueldito;
			}
				
			
		}
		
		
		System.out.println("El sueldo maximo es: " + sueldoMayor);	
		
		
		
		
		

	}

}

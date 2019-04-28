package ejercicio_21;

import java.util.Scanner;

public class ContNegativos {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n, contNegativos;
		contNegativos = 0;
		
		for (int i=1; i<=10; i++)	{
			System.out.println("Ingrese un numero: ");
			n = keyboard.nextInt();
			
			if (n<0) {
				contNegativos++;
			}
		}
		
		System.out.println("Se ingresaron " + contNegativos + " " + "numeros negativos");
		
	
	
	
	
	
	
	
	}

}

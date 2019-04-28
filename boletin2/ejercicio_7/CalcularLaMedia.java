package ejercicio_7;

import java.util.Scanner;

public class CalcularLaMedia {
	
	int num = 0;
	int contador = 1;
	double suma = 0;
	double media = 0;
	
	String pepito;

	public static void main(String[] args) {
		
		CalcularLaMedia calcularLaMedia = new CalcularLaMedia();

	    System.out.println("La media es: " + calcularLaMedia.calculoDeMedia());

	    }
	
	
	
	public double calculoDeMedia () {

		Scanner keyboard = new Scanner(System.in);
	    System.out.println(pepito);
		
		System.out.println("Ingrese un numero: (si ingresa 0 o un numero negativo, se detendra el proceso) ");
		int num = keyboard.nextInt();
		
		while (num > 0) {
			
			suma += num;                             
			media = suma/contador;
			System.out.println("Ingrese un numero: (si ingresa 0 o un numero negativo, se detendra el proceso) ");
			num = keyboard.nextInt();
			contador++;
		}
		
		return media;
		
	}

}

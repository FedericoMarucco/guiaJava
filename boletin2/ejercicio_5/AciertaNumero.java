package ejercicio_5;

import java.util.Scanner;

import ejercicio_7.CalcularLaMedia;

public class AciertaNumero {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
				
		int N;
		int n;
		n=0;
		System.out.println("ingrese el numero a adivinar: ");
		N = keyboard.nextInt();
		System.out.println("ingrese un numero: ");
		n = keyboard.nextInt();
		
        while (n!=N){
        	
    		if (n>N) {
    			System.out.println("ingrese un numero mas chico");
    				n = keyboard.nextInt();
    		}
    		else if (n<N) {
    			System.out.println("ingrese un numero mas grande");
    				n = keyboard.nextInt();
    		}
    		
    		
        }
        System.out.println("Acertaste");
		
		
		
	}

}

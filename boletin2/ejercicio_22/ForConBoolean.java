package ejercicio_22;

import java.util.Scanner;

public class ForConBoolean {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int nota;
		boolean hay_suspenso = false;
		
		
		for (int i=1; i<6; i++) {
			System.out.println("Ingrese las notas: ");
			nota = keyboard.nextInt();
			if (nota<=5) {
				hay_suspenso = true;
			}
		}
	
		if (hay_suspenso == true) {
			System.out.println("Si hay al menos un suspenso");
		}
		else {
			System.out.println("No hay ningun suspenso");
		}
	
	
	
	}

}

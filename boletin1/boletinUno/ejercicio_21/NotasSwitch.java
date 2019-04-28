package boletinUno.ejercicio_21;

import java.util.Scanner;

public class NotasSwitch {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int nota;
		
		System.out.println("Ingrese una nota: ");
		nota= keyboard.nextInt();
		
		
		if (nota>=0 && nota<=10) {
			switch (nota) {
				case 0:
					System.out.println("Cero");
					break;
				case 1:
					System.out.println("Uno");
					break;
				case 2:
					System.out.println("Dos");
					break;
				case 3:
					System.out.println("Tres");
					break;
				case 4:
					System.out.println("Cuatro");
					break;
				case 5:
					System.out.println("Cinco");
					break;
				case 6:
					System.out.println("Seis");
					break;
				case 7:
					System.out.println("Siete");
					break;
				case 8:
					System.out.println("Ocho");
					break;
				case 9:
					System.out.println("Nueve");
					break;
				case 10:
					System.out.println("Diez");
					break;
			}
		
		}
		
		
	}	
		
}		
		/*	switch(dia) {
		
		case 5:
			//codigo
			break;
		case 2:
			//aca va el codigo
			
			break;
		default:
			
			break;
		}*/
	

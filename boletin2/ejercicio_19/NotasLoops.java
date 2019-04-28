package ejercicio_19;

import java.util.Scanner;

public class NotasLoops {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int nota, suspensos, condicionados, aprobados;
		
		suspensos = 0;
		condicionados = 0;
		aprobados = 0;
		
		for (int i=1; i<=6 ; i++ ) {
			System.out.println("Ingrese la nota numero" + " " +i);
			nota = keyboard.nextInt();
			
			if (nota>=0 && nota<=10) {
				switch (nota) {
					case 0:
						suspensos++;
						break;
					case 1:
						suspensos++;
						break;
					case 2:
						suspensos++;
						break;
					case 3:
						suspensos++;
						break;
					case 4:
						condicionados++;
						break;
					case 5:
						aprobados++;
						break;
					case 6:
						aprobados++;
						break;
					case 7:
						aprobados++;
						break;
					case 8:
						aprobados++;
						break;
					case 9:
						aprobados++;
						break;
					case 10:
						aprobados++;
						break;
				}
			}
		}
		

		System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
		System.out.println("La cantidad de alumnos condicionados: " + condicionados);
		System.out.println("La cantidad de alumnos suspensos: " + suspensos);		
		
		

	}

}

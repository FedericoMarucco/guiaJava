package ejercicio_15;

import java.util.Scanner;

public class EdadesYAlturas {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int edad, contAltura, contEdad, contMayores, contEstatura;
		double altura, mediaEstatura, mediaEdad, sumaEdad, sumaAltura;
	   
		sumaEdad = 0;
	    sumaAltura= 0;
	    mediaEdad = 0;
	    mediaEstatura = 0;
		contEstatura = 1;
		contEdad = 1;
		contMayores= 0;
		contAltura = 0;
		
		for (int i=1; i<=5; i++) {
			System.out.println("Ingrese la edad: ");
			edad = keyboard.nextInt();
			System.out.println("Ingrese la altura: ");
			altura = keyboard.nextDouble();
			
			sumaEdad+= edad;
			mediaEdad =  ((double)sumaEdad)/contEdad;
			contEdad++;
			
			sumaAltura+= altura;
			mediaEstatura = ((double)sumaAltura)/contEstatura;
			contEstatura++;
			
			if (edad>18) {
				contMayores++;
			}
			if (altura>(1.75)) {
				contAltura++;
			}
			
		}
			
		System.out.println("La edad media es: " + mediaEdad);
		System.out.println("La edad estatura media es: " + mediaEstatura);
		System.out.println("Los mayores de edad son: " + contMayores);
		System.out.println("Las cantidad de alumnos que miden mas de 1.75: " + contAltura);
	}

}

package boletinUno.ejercicio_3;

import java.util.Scanner;

public class Longitud_de_una_circunferencia {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        double r,l;
        
        System.out.println("ingrese el radio: ");
        r = keyboard.nextDouble();
        l = 2* Math.PI*r;
        System.out.println("La longitud es l = "+l);
	}

}

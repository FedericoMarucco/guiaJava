package boletinUno.ejercicio_22;

import java.util.Scanner;

public class DeNumeroAString {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);	
	
		int nota;
		int unidad, decena;
		System.out.println("Ingrese una nota: ");
		nota= keyboard.nextInt();
		
		decena= (nota/10);
		unidad= (nota)-(decena*10);
		
		String notaAString = "";
	
		if (nota >= 0 && nota <100)
		{
			if (nota == 0)
				notaAString="cero";
			if (nota == 10)
				notaAString= "diez";
			if (nota >0 && nota <10 )
			notaAString = asignaUnidad(nota);
			if (nota > 10 && nota <100 ) {
				
				notaAString = asignaDecena(decena) + " " + "y" + " " + asignaUnidad(unidad); 
				
			}
		}
		
		
		System.out.print(notaAString);
	}

    
	
	
	
	
	static String asignaUnidad (int numerito) {
		
		String unidadString = "";
		
		if (numerito >0 && numerito <10) {
			switch (numerito) {
			
			case 1: return (unidadString = "uno");
			case 2: return (unidadString = "dos");
			case 3: return (unidadString = "tres");
			case 4: return (unidadString = "cuatro");
			case 5: return (unidadString = "cinco");
			case 6: return (unidadString = "seis");
			case 7: return (unidadString = "siete");
			case 8: return (unidadString = "ocho");
			case 9: return (unidadString = "nueve");
			default: return unidadString = "";
			}
		}
		else return unidadString;
	
	}
	static String asignaDecena (int decena) {
		
		String decenaString = "";
		
		if (decena >0 && decena <10) {
			switch (decena) {
			
			case 1:return (decenaString = "diez");
			
			case 2: return (decenaString = "veinte");
			case 3: return (decenaString = "treinta");
			case 4: return (decenaString = "cuarenta");
			case 5: return (decenaString = "cincuenta");
			case 6: return (decenaString = "sesenta");
			case 7: return (decenaString = "setenta");
			case 8: return (decenaString = "ochenta");
			case 9: return (decenaString = "noventa");
			default: return decenaString = "";
			}
		}
		else return null;
	
	}


	
	
	
	
	
	
	
	
}

package ejercicio_9;

import Static_Methods.StaticMethods;

public class PosicionesHaciaAbajo {

	public static void main(String[] args) {
		
		int guardar=0;
		int array [] = new int [10];
		int arrayNuevo [] = new int [10];
				
		StaticMethods.cargarArray(array);
		
		for (int i=0 ; i<array.length ; i++) { 
			
			if (i<9) {
				arrayNuevo[i+1]= array [i];
			}
			else {
				guardar= array [i];
				arrayNuevo[0] = guardar;
			}
		}
		
		StaticMethods.printArray(arrayNuevo);
	}

}

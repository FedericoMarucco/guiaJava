package ejercicio_14;

import Static_Methods.StaticMethods;

public class CopiarDosTablas {

	public static void main(String[] args) {
		
		int array [] = new int [3];
		int arrayN [] = new int [3];
		int arrayExtra[] = new int [6];
		int k = 0;
		int m = 0;
	
		StaticMethods.cargarArray(array);
		StaticMethods.cargarArray(arrayN);
		
		for (int i=0; i < arrayExtra.length ; i++) {
			if (k < array.length) {
				arrayExtra[i] = array[k];
				k++;
			}
			else {
				arrayExtra[i] = arrayN[m];
				m++;
			}
		}
		
		StaticMethods.OrdenarArrayCreciente(arrayExtra);
		StaticMethods.printArray(arrayExtra);
	}	
}

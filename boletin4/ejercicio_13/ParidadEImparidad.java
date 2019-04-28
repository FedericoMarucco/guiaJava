package ejercicio_13;

import Static_Methods.StaticMethods;

public class ParidadEImparidad {
	
	public static void main(String[] args) {
		
		int array [] = new int [10];
		int arrayN [] = new int [10];
		int arrayExtra[] = new int [10];
		
		StaticMethods.cargarArray(array);
		
		int k=0;
		int m=0;
		int j=0;
		
		for (int i=0; i < array.length; i++) {
			if (array[i]%2==0) {
				arrayN[k] = array [i];
					k++;
			}
			else {
				arrayExtra[m]= array[i];
				m++;
			}
		
		}
		
		
		
		
		
		for (int i=0; i <= arrayN.length; i++) {
			if (i>k) {
			arrayN[k]= arrayExtra[j];
			k++;
			j++;
			}
		}
		
		
	StaticMethods.printArray(arrayN);
	}

}

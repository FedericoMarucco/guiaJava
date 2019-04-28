package ejercicio_11;

public class Producto_Primeros_10_Num_Impares {

	public static void main(String[] args) {
		
		int producto;
		producto = 1;
		int i;
	
		for(i=1; i<20 ; i++) {
			if (i%2!=0) {
				producto*=i ;
			}
		}
		
		
		System.out.println("El producto es : " + producto); //654729075

		
		


	}

}

package boletinUno.ejercicio_8;

import java.util.Scanner;

public class Mayor_o_iguales {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in); 
	
	
        int n1,n2;
		
		System.out.println("Ingrese el primer numero: ");
		n1 = keyboard.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = keyboard.nextInt();
	
	
	   if (n1!=n2) {
	      if (n1>n2) {
              System.out.println("el mayor es n1");
	                  }
           else    
        	  System.out.println("el mayor es n2");
	
	             }
	   else {
		   System.out.println("los numeros son iguales");
	         }
	   
	   
	   
	   
	}
	
}

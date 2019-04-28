package boletinUno.ejercicio_9;

import java.util.Scanner;

public class Ordenamiento {

	public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int n1,n2;
    
    System.out.println("Ingrese el primer numero: ");
    n1 = keyboard.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    n2 = keyboard.nextInt();
    
    
    if (n1>n2) { 
    	System.out.println(n1 + " " + n2); 
    }
    else {
    	System.out.println(n2+ " " + n1);
      }
    

   
    
    
    
    
    
    
    

	}

}

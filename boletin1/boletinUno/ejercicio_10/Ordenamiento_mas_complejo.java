package boletinUno.ejercicio_10;

import java.util.Scanner;

import Static_Methods.StaticMethods;

public class Ordenamiento_mas_complejo {

	public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int n1,n2,n3;
    
    System.out.println("Ingrese el segundo numero: ");
    n1 = keyboard.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    n2 = keyboard.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    n3 = keyboard.nextInt();
    
    
    
    
    
    if(n1>n2 && n1>n3) {
    	if (n2>n3) {
    		System.out.println(n1 + " " + n2 + " " + n3);
    	}
    	else {
    		System.out.println(n1 + " " + n3 + " " + n2);
    	}
    		
    }
    
   
    if (n2>n1 && n2>n3) {
    		if (n1>n3) {
    			System.out.println(n2 + " " + n1 + " " + n3);
    		}
    		else {
    			System.out.println(n2 + " " + n3 + " " +n1);
    		}
    	}
    
     
   	if (n3>n1 && n3>n2) {
   		if(n1>n2) {
   			System.out.println(n3 + " " + n1 + " " + n2);
   		}
   		else {
   			System.out.println(n3 + " " + n2 + " " + n1);
   		}
   	}
    	
    
    
    
    
    
    
    
    
    
	

    }
}
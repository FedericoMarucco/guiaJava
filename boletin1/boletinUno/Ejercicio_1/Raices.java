package boletinUno.Ejercicio_1;

import java.util.Scanner;



public class Raices {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		int a,b,c ;
        double x1,x2,d;
       
        System.out.println("Ingrese el coeficiente a: ");
        a = keyboard.nextInt();
        System.out.println("Ingrese el coeficiente b: ");
        b = keyboard.nextInt();
        System.out.println("Ingrese el coeficiene c: ");
        c = keyboard.nextInt();
        
        d = ((b*b)-4*a*c);
        
        if (a!=0 && d>0) {
	       x1 = (-b+Math.sqrt(d))/(2*a);
	       x2 = (-b-Math.sqrt(d))/(2*a);
	       System.out.println("Las raices son: "+ x1 + " " +"y" + " " + x2);
            }
        
        		
        }
	
        
        
        
        

}

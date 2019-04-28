package ejercicio_5;

import java.util.Scanner;

public class ContadorCincoDigitos {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		for (int i=0; i<=9; i++) {
			if (i==3) 
				System.out.print("E");
			
			else 
				System.out.print(i);
			
			for (int j=0; j<=9; j++) {
				if (j==3) 
					System.out.print("E");
				
				else 
					System.out.print(j);
				
			
				for (int k=0; k<=9; k++) {
					if (k==3) 	
						System.out.print("E");
					
					else 
						System.out.print(k);
					
			
					for (int l=0; l<=9; l++) {
						if (l==3) 
							System.out.print("E");
						
						else 
							System.out.print(l);
						
			
						for (int m=0; m<=9; m++) {
							if (m==3) 
								System.out.print("E");
							
							else 
								System.out.print(m);
							System.out.println(" ");
							
						}
					}
				}
			}
		}
		
		
		
		
		

	}

}

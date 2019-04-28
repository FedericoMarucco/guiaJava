package ejercicio_18;

import java.util.Scanner;

public class FacturaComplicada {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int codArt, cantLitros, cantLitrosArt1, contFacturas;
		double ventaArtUno, ventaArtDos, ventaArtTres;
		double facturacionTotal;
		
		cantLitrosArt1 = 0;
		contFacturas = 0;
		facturacionTotal = 0;
		
		for (int i=1; i<=5 ; i++) {
			System.out.println("A continuacion se le pediran los datos de la factura" + " " + i);
			System.out.println("Ingrese el codigo del articulo: ");
			codArt = keyboard.nextInt();
			System.out.println("Ingrese la cantidad vendida en litros: ");
			cantLitros = keyboard.nextInt();
		
			if (codArt == 1) {
				cantLitrosArt1 += cantLitros;
				ventaArtUno= cantLitros * 0.6 ;
				facturacionTotal += ventaArtUno;
				
				if (ventaArtUno >600) {
					contFacturas ++;
				}
			}	
			else if (codArt == 2) {
				ventaArtDos= cantLitros * 3 ;
				facturacionTotal += ventaArtDos;
				
				if (ventaArtDos >600) {
					contFacturas ++;
				}
				
			}
			else if (codArt == 3) {
				ventaArtTres= cantLitros * 1.25 ;
				facturacionTotal += ventaArtTres;
				
				if (ventaArtTres >600) {
					contFacturas ++;
				}
			}	
					
	    }		
				
				
	System.out.println("La facturacion total es : " + facturacionTotal +" " + "euros");
	System.out.println("La cantidad en litros vendidos del articulo uno es : " + cantLitrosArt1);
	System.out.println("Las facturas de mas de 600 euros son: " + contFacturas);		
				
			
			
			
			
				
		
	}

}

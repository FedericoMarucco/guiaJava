package ejercicio_17;

import java.util.Scanner;

public class Factura {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int cantLitros, cantLitrosArt1,  codArt;
		int precioXLitro; 
	
		long venta, facturacionTotal;
		int contFacturas;
		contFacturas = 0;
		
		cantLitrosArt1 = 0;
		facturacionTotal = 0;
		
		
		
		for (int i=1; i<=5 ; i++) {
			System.out.println("A continuacion se le pediran los datos de la factura" + " " + i);
			System.out.println("Ingrese el codigo del articulo: ");
			codArt = keyboard.nextInt();
			System.out.println("Ingrese la cantidad vendida en litros: ");
			cantLitros = keyboard.nextInt();
			System.out.println("Ingrese el precio por litro: ");
			precioXLitro = keyboard.nextInt();
			
			venta = cantLitros * precioXLitro;
			facturacionTotal += venta ;
			if (venta>600) {
				contFacturas ++;
			}
			
			
			if (codArt == 1) {
				cantLitrosArt1 += cantLitros;
			}
				
		}
			
		
		
	
		System.out.println("La facturacion total es : " + facturacionTotal +" " + "euros");
		System.out.println("La cantidad en litros vendidos del articulo uno es : " + cantLitrosArt1);
		System.out.println("Las facturas de mas de 600 euros son: " + contFacturas);
		
		
		
		
		
		
	}

}

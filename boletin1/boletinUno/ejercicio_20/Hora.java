package boletinUno.ejercicio_20;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);	
		

	int seg, min, hora;
	int segN, minN, horaN;
	
	
	System.out.println("Ingrese los segundos: ");
	seg = keyboard.nextInt();
	System.out.println("Ingrese los minutos: ");
	min = keyboard.nextInt();
	System.out.println("Ingrese la hora: ");
	hora = keyboard.nextInt();
	
	if (seg>=0 && seg<60 && min<60 && min>=0 && hora>=0 && hora<24) {
		if(seg==59 && min==59 && hora==23) {
			segN= 0;
			minN= 0;
			horaN= 0;
			System.out.println("La siguiente hora es: " + horaN + ":" + minN + ":" + segN);
		}
		if (seg==59 && min==59 && hora<23) {
			segN= 0;
			minN= 0;
			horaN= hora+1;
			System.out.println("La siguiente hora es: " + horaN + ":" + minN + ":" + segN);
		}
		if (seg==59 && min<59 && hora<=23) {
			segN=0;
		    minN= min+1;
		    horaN= hora;
		    System.out.println("La siguiente hora es: " + horaN + ":" + minN + ":" + segN);
		}
		if(seg<59 && min<=59 && hora<=23) {
		segN=seg+1;
        minN=min;
        horaN=hora;
        System.out.println("La siguiente hora es: " + horaN + ":" + minN + ":" + segN);
	    }  
	}	
	else {
		System.out.println("Ingrese la hora correctamente");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

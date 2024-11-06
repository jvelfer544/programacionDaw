package unidad02;

import java.util.Scanner;

public class ejemploScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Introduce una cadena");
		String cadena = scan.nextLine();
		
		System.out.println(" Introduce un número ");
		int numero = scan.nextInt();
		
		System.out.println(" Introduce una segunda cadena ");
		scan.nextLine();
		cadena = scan.nextLine();
		
		System.out.println("El número es: " + numero + " - " + cadena);
	
				
		
	}

}

package unidad02;
import java.util.Scanner;

public class do_while {
// EjemploDoWhile.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Introduce un número (negativo para salir): ");
			numero= scan.nextInt();
			System.out.println("Has Introducido: " + numero);
		}
			while (numero >= 0);
			
		System.out.println(" Fin del programa ");
		scan.close();
			
	}

}

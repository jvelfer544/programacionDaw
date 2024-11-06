package unidad_1;
import java.util.Scanner;

public class Parlmpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero y veremos si es par o impar;");
		int numero;
		numero = scan.nextInt();
		String paridad;
		/*  operador ternario
		 * condicion ? valor_si_verdadero : valor_si_falso
		 *  numero % 2 == 0 verifica si el número es divisible por 2 (lo que significa que es par).
		 */
		paridad = numero % 2 == 0 ? "Par" : "Impar";
		System.out.println("El número introducido es " + paridad);
		
		
	}

}

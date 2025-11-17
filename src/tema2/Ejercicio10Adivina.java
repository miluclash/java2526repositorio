

package tema2;

import java.util.Scanner;
import java.util.Random;
public class Ejercicio10Adivina {

	public static void main(String[] args) {
		//1-Inicializacion
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//Genera un numero aleatorio entre 1 y 100.
		
		final int NUMERO_SECRETO= random.nextInt(100)+1;
		
		System.out.println("Bienvenido al juego de ADIVINANZA.");
		System.out.println("He generado un numero entre 1 y 100.");
		int n=0;
		
		
		while(n!=NUMERO_SECRETO) {
			System.out.println("ADIVINA EL NUMERO: ");
			
			if(scanner.hasNextInt()) {
				n=scanner.nextInt();
			if(n>NUMERO_SECRETO) {
				System.out.println("El numero es menor.");
				System.out.println("Intenta  otra vez:");
			}else {
				System.out.println("El numero es mayor.");
				System.out.println("Intenta  otra vez:");	
			}
			}//fin if scanner
			else {
				System.out.println("Introduce un numero valido.");
				scanner.next();//Para pedir un nuevo numero y limpar la entrada.
			}
			
		}//fin while
		System.out.println("CORRECTO!");
		scanner.close();
		

	}

}

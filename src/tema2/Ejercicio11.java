package tema2;

import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// Programa que va pidiendo numeros por pantalla hasta que
		//se introduzca el cero y cunado terminar dice cual ha sido
		//el mayor de todos.
		int n=0;
		int mayor= Integer.MIN_VALUE;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Introduzca un numero: ");
			mayor=sc.nextInt();
		}while (n!=0);{
			if(n>mayor)
				mayor=n;
	
		}System.out.println("El numero mayor ha sido: "+mayor);
		sc.close();
	}

}

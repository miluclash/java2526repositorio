//. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
//metemos n sueldos y tenemos que sacar aquel que es el mas grande

package CondicionalesYBucles;
import java.util.Scanner;
public class ej20SueldoMaximo {

	public static void main(String[] args) {
// de una cantidad grande, buscamos el maximo comun divisor entre la cantidad y el numero de sueldos.
		int num,sueldo;
		float sueldoMax=0;//sueldo maximo, lo incializamos en cero
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de sueldos: ");
		num=sc.nextInt();
		System.out.println("--------");

		
		for(int i=1;i<=num;i++) {
			System.out.println("Ingrese el sueldo:");
			sueldo=sc.nextInt();
			if (sueldo>sueldoMax) {
				sueldoMax=sueldo; 
				// si leemos un sueldo mayor que el máximo, este sueldo será el nuevo máximo.

			}
			
		
	}System.out.println("El sueldo maximo es: "+sueldoMax);
	sc.close();
	}

}

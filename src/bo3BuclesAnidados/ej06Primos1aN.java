/* Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son
primos. */

package bo3BuclesAnidados;

import java.util.Scanner;
public class ej06Primos1aN {

	public static void main(String[] args) {
		/*Necesito: una variable donde guardar cada numero desde 1 a n, que se vaya sumando +1 hasta n(bucle)
		 * comprobar que es primo(bucle interno que : el resto de dividir n entre cualquier numero es != de 0 es primo) con una variable boolean
		 * contador que sume +1 cuando el anterior bucle confirme que hay un numero primo--> hasta n.
		 * 
		 * */
		int n,divisor,contador=0;
		boolean primo;
		Scanner sc =new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		n=sc.nextInt();
		int dividendo;
		
		for(dividendo=1; dividendo<=n; dividendo++) {
			primo=true;
			divisor=2;
			while(divisor<=dividendo-1 && primo==true) {
				if(dividendo%divisor==0) {
					primo=false;
					}
					divisor++;	
			}
			if (primo==true) {
				contador++;//sumo uno al contador de primos
				System.out.println(dividendo+(" es primo"));
			}
			}
		System.out.println("En el rango de 1 a "+n+", hay "+contador+" numeros primos.");
		sc.close();
	}

}

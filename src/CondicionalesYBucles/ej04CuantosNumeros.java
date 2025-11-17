//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.

package CondicionalesYBucles;

import java.util.Scanner;
public class ej04CuantosNumeros {

	public static void main(String[] args) {
		int num,contador;
		Scanner sc= new Scanner(System.in);
		
		//1-pedimos numeros y lo guardamos
		System.out.println("Introduzca un numero: ");
		num=sc.nextInt();
		
		//2-comprobamos q el numero no es negativo
		//Si es positivo añadimos +1 al contador y pedimos otro numero
		//Cuando el numero que metamos sea <0, paramos el contador y mostramos el valor de contador.
		contador=0;
		if(num>=0) {//el if os opcional pero lo pongo en caso de que el primer numero introducido sea negativo
			
			while(num>=0) {
				contador++;		
				System.out.println("Introduzaca otro numero:");
				num=sc.nextInt();
			}System.out.println("Se han introducido: "+contador+" numeros.");//sin tener en cuenta el ultimo numero negativo
		}//fin if 
		else {
			System.out.println("Se han introducido: "+contador+" numeros.");
			
		}
		sc.close();
		


	}

}

//Pedir un número N, y mostrar todos los números del 1 al N.


package CondicionalesYBucles;

import  java.util.Scanner;

public class ej08MostrarNNumeros {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		n=sc.nextInt();
//hare un bucle en el que vaya restando -1 al numero que meti y vaya mostrando ese nuevo  umero hasta 
//que llegue al 1
		
		/*while(n!=1) {
			n--;
			System.out.println(n);	
		}esto es para imprimri desde n hasta 1 de forma descendente*/
		
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;	
		}
		sc.close();
	}

}

//Pedir un número y calcular su factorial.

package CondicionalesYBucles;

import java.util.Scanner;
public class ej12NumeroFactorial {

	public static void main(String[] args) {
		int n;	
		double factorial=1;//con long solo se puede calcualr hasta el 25 factorial
		Scanner sc =new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		n=sc.nextInt();
		//el factorial es multiplicar el numero por el numero menos 1 unidad hasta que llegue a 1.
		for(int i=n; i>0; i--) {
			factorial=factorial*i;
		}
		System.out.println("el factorial de "+n+" es "+factorial);
		sc.close();
	}

}

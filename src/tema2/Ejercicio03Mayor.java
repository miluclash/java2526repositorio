package tema2;

import java.util.Scanner;
public class Ejercicio03Mayor {

	public static void main(String[] args) {
		//Pedimos dos numeros y mostramos por pantalla cual es mayor
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Introduce un numero: ");
		n1=sc.nextInt();
		System.out.println("Introduce un numero: ");
		n2=sc.nextInt();
		
	//comprobamos si son iguales
		
		if(n1 > n2) {
			System.out.println("N1 es Mayor que N2");
		
		}
		else if (n1<n2){
			System.out.println("N1 es Menor que N2");
		
			} else {
			System.out.println("N1 y N2 son iguales");
		}
		
		sc.close();
		
	}

}

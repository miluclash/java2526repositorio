package tema2;

import java.util.Scanner;
public class Ejercicio02Iguales {

	public static void main(String[] args) {
		//Pedimos dos numeros y mostramos por pantalla si son iguales
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Introduce un numero: ");
		n1=sc.nextInt();
		System.out.println("Introduce un numero: ");
		n2=sc.nextInt();
		
	//comprobamos si son iguales
		
		if(n1 == n2) {
			System.out.println("Son iguales");
		
		}
		else {
			System.out.println("No son Iguales");
			
		}
		
		sc.close();
		
	}

}

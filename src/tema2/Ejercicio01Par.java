package tema2;

import java.util.Scanner;
public class Ejercicio01Par {

	public static void main(String[] args) {
		//Pedimos un numero y mostramos por pantalla si es par o impar
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		
		//Comprobamos si es par
		if(num%2 == 0) {
			System.out.println("Es Par");
		
		}
		else {
			System.out.println("Es Impar");
			
		}
		
		sc.close();
		
	}

}

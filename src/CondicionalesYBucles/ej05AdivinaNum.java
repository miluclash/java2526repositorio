//Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
//números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
//cuando el usuario acierta.


package CondicionalesYBucles;

import java.util.Scanner;
public class ej05AdivinaNum {

	public static void main(String[] args) {
		int n;
		double guessedNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivina el numero del 1 al 10: ");
		n=sc.nextInt();
		guessedNum=(Math.random()*10)+1;//numero que queremos adivinar
										//El math.random solo genera del 0.0 al 1.0, por tanto
									//multiplicmao por 30 para q sea un limite(del 1 al 30)
		int num =(int) guessedNum;//lo convertirmos a int para solo tener que adivinar numeros enteros
		//adivinamos con un bucle hasta que no lo consigmaos(while)
		
		int contador=1;
		while(n!=num) {
			if (n<num) {
			System.out.println("NAH-AH");
			System.out.println("EL numero es mas grande.");
			System.out.println("Prueba otra vez:");
			n=sc.nextInt();
			contador++;
			}else  {//para cuando el numero sea mas pequeño , si no es mas grande, enotnces es mas pequeño.
				System.out.println("NAH-AH");
				System.out.println("EL numero es mas pequeño.");
				System.out.println("Prueba otra vez:");
				n=sc.nextInt();
				contador++;
			}
				
		}
		System.out.println("GG");
		System.out.println("Lo has adivinado en: "+contador+" intentos.");
		
		sc.close();
		
		

	}

}

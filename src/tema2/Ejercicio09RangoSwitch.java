package tema2;

import java.util.Scanner;
public class Ejercicio09RangoSwitch {

	public static void main(String[] args) {
		int edad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		edad=sc.nextInt();
		switch(  1<=edad && edad<=5 ? 0 :
			6<=edad && edad<=10 ? 1 :
				11<=edad && edad<=15? 2 :
					3  ) {
		case 0->
			System.out.println("Tienes entre 0 y 5 años.");
		case 1 ->
		System.out.println("Tienes entre 6 y 10 años.");
		case 2 ->
		System.out.println("Tienes entre 11 y 15 años.");
		case 3->
		System.out.println("Tienes entre 0 y 5 años.");
		
		}
		sc.close();
		
	}

}

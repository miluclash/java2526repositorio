package tema2;

import java.util.Scanner;

public class Ejercicio14Primos3 {

	public static void main(String[] args) {
		int numCalcular;
		Scanner sc= new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		numCalcular=sc.nextInt();
		boolean esPrimo=funcionEsPrimo(numCalcular);
		if(esPrimo) 
			System.out.println("Numero: "+numCalcular+" es primo.");
			else
				System.out.println("Numero: "+numCalcular+" no es primo.");
		sc.close();

	}
	
	public static boolean funcionEsPrimo(int numCalcular) {

		boolean esPrimo=true;
		int i=2;
		while(i<numCalcular && esPrimo) {
		//4/4=0	
			if(numCalcular%i==0) {
				esPrimo=false;
			}
			i++;
			}
		return esPrimo;
	}
}

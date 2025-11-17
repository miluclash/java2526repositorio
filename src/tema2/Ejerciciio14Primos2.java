package tema2;
import java.util.Scanner;
public class Ejerciciio14Primos2 {

	public static void main(String[] args) {
		// ejercicio pide un numero por pantalla y me dice si es primo
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		n=sc.nextInt();
		boolean esPrimo=true;
		int i=2;
		while(i<n && esPrimo) {
		//4/4=0	
			if(n%i==0) {
				esPrimo=false;
			}
			i++;
			}//fin while
		if(esPrimo) 
			System.out.println("Numero: "+n+" es primo.");
			else
				System.out.println("Numero: "+n+" no es primo.");
		sc.close();
		
		
		}
	}



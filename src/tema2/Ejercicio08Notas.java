

package tema2;

import java.util.Scanner;
public class Ejercicio08Notas {

	public static void main(String[] args) {
		int nota;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		nota=entrada.nextInt();
		//version sin "case" , usando ->
		switch(nota) {
		case 0,1,2,3,4 ->
			System.out.println("Insuficiente.");
		case 5 ->
			System.out.println("Suficiente.");
			
		case 6->
			System.out.println("Bien");
		
		case 7,8 ->
			System.out.println("Notable");
			
		case 9,10 ->
			System.out.println("Sobresaliente");
		default ->
			System.out.println("ERROR: Ingresa notas del 0 al 10.");	
		}//fin case

	entrada.close();
	
	}

}

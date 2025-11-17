package tema2;

import java.util.Scanner;
public class Ejercicio06DiasIf {

	public static void main(String[] args) {
			//Pedimos un numero y nos de el dia de la semana correspondinte: 1-lunes,2-martes...
			
		int dia ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		dia= sc.nextInt();
		
		if (dia ==1) { 
			System.out.println("El día es lunes.");
		} else if (dia == 2) {
			System.out.println("El día es martes");
		}else if (dia == 3) {
			System.out.println("El día es miercoles");
		}else if (dia == 4) {
			System.out.println("El día es jueves");
		}else if (dia == 5) {
			System.out.println("El día es viernes");
		}else if (dia == 6) {
			System.out.println("El día es sabado");
		}else if (dia == 7) {
			System.out.println("El día es domingo");
		}else {
			System.out.println("Inserte un número del 1 al 7");
		}
		sc.close();
		
	}

}

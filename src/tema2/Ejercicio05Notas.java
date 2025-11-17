package tema2;

import java.util.Scanner;
public class Ejercicio05Notas {

	public static void main(String[] args) {
		//Pide una nota numerica(0-10) y muestra la nota del boletin
		//(suspenso,bien,notable,sobresaliente)		
		
		
		Scanner sc=new Scanner(System.in);
		float f1;
		System.out.println("Introduce un numero: ");
		f1=sc.nextFloat();
		
		if (f1<0 && f1>10) {
			
		} else if(f1>0 && f1<=4){
			System.out.println("SUSPENSO");
			
		} else if(f1>4 && f1<=6){
			System.out.println("BIEN");
				
		}else if(f1>6 && f1<=8){
			System.out.println("NOTABLE");
				
		}else if(f1>8 && f1<=10){
			System.out.println("SOBRESALIENTE");
				
		}
		else {
			System.out.println("Escribe un numero del 0 al 10");
		}
		
		sc.close();
	}
		
}

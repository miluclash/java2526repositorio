//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
//negativo.

package CondicionalesYBucles;

import java.util.Scanner;
public class ej01Cuadrado {

	public static void main(String[] args) {
		//int num; <-- esto es para solo meter numeros enteros peroyo le pondre un double para q me de
		//el cuadrado de cualquier numero positivo.
		double sq,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introudzca un numero: ");
		num=sc.nextDouble();
		while(num>=0) {//se repite el cuadrado mientras no pongamos un numero negativo	
			sq=Math.pow(num, 2);
			System.out.println("El cuadrado es: "+sq);
			System.out.println("Introduzca otro numero: ");
			num=sc.nextDouble();
			
		}
		sc.close();
		

	}

}

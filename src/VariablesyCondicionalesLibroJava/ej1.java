//Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales.
//Si no existen,debe indicarlo.

package VariablesyCondicionalesLibroJava;

import java.util.Scanner;
public class ej1 {

	public static void main(String[] args) {
//Variables,sqrt es el valor que hay dentro de la raiz, si esta es negativa, no hay solucion real.
//sqrt es double por si el radicando tiene decimales
		int n1,n2,n3;
		double sqrt,s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el primer coeficiente: ");
		n1=sc.nextInt();
		System.out.println("Ingrese el segundo coeficiente: ");
		n2=sc.nextInt();
		System.out.println("Ingrese el tercer coeficiente: ");
		n3=sc.nextInt();
		
		sqrt= (Math.pow(n2,2))-(4*n1*n3);
		if (sqrt<0) {
			System.out.println("No tiene soluciones reales");
		} else {
			s1= (-n2+(Math.sqrt(sqrt)))/2*n1;
			s2= (-n2-(Math.sqrt(sqrt)))/2*n1;
			System.out.println("Las soluciones reales son: "+s1+" y "+s2);
		}
		
		sc.close();
	} 
	

}

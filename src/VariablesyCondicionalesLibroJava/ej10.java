//Pedir tres números y mostrarlos ordenados de mayor a menor.

package VariablesyCondicionalesLibroJava;

import java.util.Scanner;
public class ej10 {

	public static void main(String[] args) {
	//variables
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número: ");
		n1=sc.nextInt();
		System.out.println("Ingrese el segundo número: ");
		n2=sc.nextInt();
		System.out.println("Ingrese el tercer número: ");
		n3=sc.nextInt();
		
		//usamos if para cada caso
		
		if (n1>n2 && n1>n3) {
			if (n2>n3) {
				System.out.println("el orden es:+"+n1+" "+n2+" "+n3);
			}else { System.out.println("el orden es: "+n1+" "+n3+" "+n2);}	
			
	}else if (n2>n1 && n2>n3) {
		if (n1>n3) {
			System.out.println("el orden es:+"+n2+" "+n1+" "+n3);
			}else { System.out.println("el orden es: "+n2+" "+n3+" "+n1);}
	
	}else if (n3>n1 && n3>n2) {
		if (n1>n2) {
			System.out.println("el orden es: "+n3+" "+n1+" "+n2);
			}else { System.out.println("el orden es: "+n3+" "+n2+" "+n1);}
		
	}sc.close();
	
	}
}

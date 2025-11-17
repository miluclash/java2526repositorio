//Pedir dos números y decir si uno es múltiplo del otro.
package VariablesyCondicionalesLibroJava;
import java.util.Scanner;
public class ej06 {

	public static void main(String[] args) {
		//Variables
		int n1,n2;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		n1=entrada.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2=entrada.nextInt();
		
		//comprobamos cual es el mayor para sai luego usar el resto,
		//si es 0 el resto es que son multiplos, sino, no
		
		if (n1<n2) {
			int resto= n2%n1;
			if (resto==0) {
				System.out.println("Los números son multiplos.");
			} else {
				System.out.println("los números no son múltiplos.");
					}
		} else {
			int resto= n1%n2;
			if (resto==0) {
				System.out.println("Los números son multiplos.");
			} else {
				System.out.println("los números no son múltiplos.");
				}
		} entrada.close();
		
	}

}

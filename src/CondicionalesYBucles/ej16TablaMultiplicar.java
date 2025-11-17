//Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.


package CondicionalesYBucles;
import java.util.Scanner;

public class ej16TablaMultiplicar {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		//usamos un od while para que repit la accion de poner cada numeor hasta que complete la tabla de n (del 1 la 10)
		do {
			System.out.println("Introduce un numero del 0 al 10: ");
			n=sc.nextInt();				
		}
		while (! (n>=0 && n<=10));// el "!" niega la condicion del while , por tanto el bucle solo se ejecutarr cuando eel numero no este entre 0 y 10.
		//Es decir, este bucle se repite mientras num sea menor que 0 o mayor que 10. En forma equivalente. while (num < 0 || num > 10);
			System.out.println("\n\nTabla del " + n);
		
		for (int i=1;i<=10;i++) {
		 System.out.println(n + " x " + i + " = " + n*i);
		}
		
		sc.close();	
		
	}
}

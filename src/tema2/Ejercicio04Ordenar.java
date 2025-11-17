package tema2;

import java.util.Scanner;
public class Ejercicio04Ordenar {

	public static void main(String[] args) {
		//Pedimos tres numeros y ordenamos de mayor a menor
		//Pista: hay que usar el and(&&)
		
		
		
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Introduce un numero: ");
		n1=sc.nextInt();
		System.out.println("Introduce un numero: ");
		n2=sc.nextInt();
		System.out.println("Introduce un numero: ");
		n3=sc.nextInt();
	//comprobamos si un numero es mayor directamente a los otros dos numeros
		/*hacer par casa*/
		
		if(n1>n3 && n1>n2) {
			System.out.println("N1 es el mayor");
			if (n2<n1 && n2<n3) {
				System.out.println("N2 es el menor");
				System.out.println("N3 es el mediano");
			}
			else {
				System.out.println("N3 es el menor");
				System.out.println("N2 es el mediano");
			}
			}
		
		else if (n1<n2 && n1>n3){
			System.out.println("N1 es el mediano");
			if (n2<n1 && n2<n3) {
				System.out.println("N2 es el menor");
				System.out.println("N3 es el mayor");
			}else {
				System.out.println("N3 es el mediano");
				System.out.println("N2 es el mayor");
				}
			} 
		else {
			System.out.println("N1 es el menor");
			if (n2>n1 && n2<n3) {
				System.out.println("N2 es el mediano");
				System.out.println("N3 es el mayor");
			}
			else {
				System.out.println("N3 es el mediano");
				System.out.println("N2 es el mayor");
				}
			
			}
		
		sc.close();
		
	}

}

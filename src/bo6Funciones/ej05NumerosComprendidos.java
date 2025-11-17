//Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos,
//inclusive.

package bo6Funciones;
 import java.util.Scanner;
public class ej05NumerosComprendidos {
	
	private static void nums(int a,int b) {
		int n,mayor,menor;
		if (a<b) {
			n=b-a;
			mayor=b;
			menor=a;
		
		}else {
			n=a-b;
			mayor=a;
			menor=b;
		}
		for(int i=mayor-1;i>menor;i--) {
			System.out.println(i+" ");
		}
		System.out.println(n);
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		 System.out.println("Ingrese un numero: ");
		 a=sc.nextInt();
		 System.out.println("Ingrese otro numero: ");
		 b=sc.nextInt();
		 nums(a,b);
		 sc.close();

	}

}

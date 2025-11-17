//Diseñar una función que tenga como parámetros dos números, y que calcule el máximo. 

package bo6Funciones;
import java.util.Scanner;
public class ej2NumeroMax {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese un numero : ");
		a=sc.nextInt();
		System.out.println("Ingrese otro numero: ");
		b=sc.nextInt();
		System.out.println("El numero mas grande es el: "+numMax(a,b));
		

	}
	private static int numMax(int a,int b){
		int max;
		if (a>b) {
			max=a;
		}else if(b>a){
			max=b;
		}else {
			max=a;
		}
		return (max);
	}

}

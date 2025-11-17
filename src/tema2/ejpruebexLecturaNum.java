/*Crea un programa que lea números enteros positivos introducidos por el usuario hasta que este introduzca -1. El programa debe:

Calcular y mostrar la media, el máximo y el mínimo de los números introducidos.

Si el usuario introduce un número negativo distinto de -1, el programa termina mostrando un mensaje de error.

Si no se ha introducido ningún número válido, se lanza una excepción personalizada NoDataException*/

package tema2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejpruebexLecturaNum {

	public static void main(String[] args) {
		int n,max=0,min=Integer.MAX_VALUE;
		int divisor=0;
		double media=0;
		Scanner sc=new Scanner(System.in);
		
		
		try {
			while(true){
				System.out.println("Ingrese un numero: ");
				n=sc.nextInt();
				if(n==-1) {
					break;//se acaba el programa y saca todo
				}
				if(n<0) {	
						System.out.println("ERROR, solo valores positivos.");
						return;//se acaba el programa
					}
				media=n+media;//va sumando el dividendo de la media
				divisor++;//va sumando el numero de valores que se han metido para luego hacer la media.
				if(n>max) {
					max=n;//cambia el num mayor
				}
				if(n<min) {
					min=n;//cambia el num menor
				}
				}
				
				
			media= media/divisor;//hace la media
			System.out.println("La media es: "+media);
			System.out.println("El numero maximo es: "+max);
			System.out.println("El numero minimo es: "+min);
			sc.close();
		} catch(InputMismatchException iem) {
			System.out.println("ERROR. Introduce un numero.");
		}
	}

}

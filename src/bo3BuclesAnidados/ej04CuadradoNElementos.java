//Dibuja un cuadrado de n elementos de lado utilizando *.

package bo3BuclesAnidados;
import java.util.Scanner;
public class ej04CuadradoNElementos {

	public static void main(String[] args) {
		/*EL cuadrado se hara de n columnas con n filas,
		 * Entonces, tengo que hacer n columnas de n asteriscos como filas*/
		int n,col,filas;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Ingrese el lado del cuadrado: ");
		n=sc.nextInt();
		
		for(filas=1;filas<=n;filas++) {
			System.out.println();
		for(col=1; col<=n;col++) {
			System.out.print("* ");
		}
		}

	}

}

package tema2;
import java.util.Scanner;
public class Ejercicio16Binario {

	public static void main(String[] args) {
		//Programa que  lee un numero en decimal
		//Y lo convierte a binario.
		//Para convertir a binario, dividimos entre 2 hasta que tengamos 1, y cogemos los restos de cada division
		Scanner sc = new Scanner(System.in);
		int n,resto;
		System.out.print("Ingrese un numero en decimal:");
		n=sc.nextInt();
		String binario=""; 
		while(n>=1) {
			 resto=n%2;
			 n=n/2;
			 binario=resto+binario;//esto va poniendo los 1 y 0 en orden inverso al que se realizan las divisiones.
			 System.out.print(resto);
		 }
		System.out.println();
	    System.out.println("DECIMAL->BINARIO= "+binario);  
	    sc.close();
	}

}

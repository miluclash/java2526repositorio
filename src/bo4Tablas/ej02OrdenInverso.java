//Leer 5 números y mostrarlos en orden inverso al introducido	

package bo4Tablas;
import java.util.Scanner;
public class ej02OrdenInverso {

	public static void main(String[] args) {
		int t[]= new int[5];
		Scanner sc = new Scanner(System.in);
				
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese un numero");
			t[i]=sc.nextInt();
		}
		for(int i=4;i>=0;i--) {
			System.out.println(t[i]);
			
		}
		sc.close();
		
		
		

	}

}

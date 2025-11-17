/*Leer 5 números y mostrarlos en el mismo orden introducido.*/

package bo4Tablas;
import java.util.Scanner;
public class ej01MostarEnOrden {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t=new int[5];
		 for (int i=0;i<5;i++)
		 {
		 System.out.print((i+1)+"Introduzca un número: ");
		 t[i]=sc.nextInt();
		 }
		 System.out.println("Los números son:");
		 for (int i=0;i<5;i++)
		 System.out.println(t[i]);
		 sc.close();
	}

}

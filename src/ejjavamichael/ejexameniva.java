/* Enunciado: Escribe un programa que reciba dos variables double llamadas precioUnitario y cantidad. 
 * Calcula el total sin IVA, luego el total con IVA (21%). 
 * Convierte el total con IVA a int y muestra ambos totales. 
 * Finalmente, usa un operador ternario para mostrar si el total con IVA supera los 100 euros.*/
package ejjavamichael;
import java.util.Scanner;
public class ejexameniva {

	public static void main(String[] args) {
		double precioUnitario,cantidad;
		double totalIva,totalSin;
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.print("Ingrese el precio de cada producto: ");
		precioUnitario=entrada.nextDouble();
		System.out.print("Ingrese la cantidad comprada: ");
		cantidad=entrada.nextDouble();
		
		totalSin=precioUnitario*cantidad;
		totalIva=totalSin*1.21;
		int itotalIva=(int)totalIva;
		
		//parte de ternario
	
		String supera100= (totalIva > 100)? "Si":"No"; 	
		
		System.out.println("Total sin IVA: "+totalSin);
		System.out.println("Total con IVA: "+totalIva);
		System.out.println("Total Redondeado= "+itotalIva);
		System.out.println("¿Supera los 100 euros?: "+supera100);
		entrada.close();
		
		
		
		

	}

}

/*Usa un operador lógico para determinar si una persona puede conducir. 
 * La condición es: tener al menos 18 años y tener carnet.
 *  Guarda el resultado en una variable boolean puedeConducir. 
 *  Luego, usa un operador ternario para imprimir "Acceso permitido" si puede conducir, 
 *  o "Acceso denegado" si no.*/

package ejjavamichael;
import java.util.Scanner;
public class ej4exmdescuentconversion {

	public static void main(String[] args) {
		
		int edad;
		
		boolean puedeConducir;
		
		Scanner entrada= new Scanner(System.in);
		System.out.print("Ingrese su edad: ");
		edad=entrada.nextInt();
		System.out.print("¿Tiene el carnet de conducir?: ");
		boolean tieneCarnet=entrada.nextBoolean();
		
		puedeConducir= (edad>=18)&&(tieneCarnet==true);
		String permiso= puedeConducir? "Acceso permitido." : "Acceso denegado.";
		
		System.out.println("¿Puede conducir?: "+puedeConducir);
		System.out.println("Resultado: "+permiso);
		
		entrada.close();
		
	}
	
}

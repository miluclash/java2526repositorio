/*Enunciado: Declara una variable byte llamada edad y una variable int llamada añoActual. 
Calcula el año de nacimiento usando operadores aritméticos. 
Luego, convierte edad a double y calcula cuántos días ha vivido (aproximadamente). 
Usa un operador ternario para indicar si es mayor de edad.*/
package ejjavamichael;
import java.util.Scanner;
public class ejexamoperadorytipodatos {

	public static void main(String[] args) {
		byte edad;
		int anyoActual,anyoNacimiento;
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Ingrese el año actual: ");
		anyoActual=entrada.nextInt();
		System.out.print("Ingrese su edad actual: ");
		edad=entrada.nextByte();
		
		
		anyoNacimiento=anyoActual-edad;
		double dedad=(double)edad;
		double dias=dedad*365;
		
		String mayorEdad= (edad>18)? "Mayor de edad." : "Menor de edad.";
		System.out.println("Año de nacimiento: "+anyoNacimiento);
		System.out.println("Edad en double: "+dedad);
		System.out.println("Días vividos aproximadamente: "+dias);
		System.out.println("¿Mayor de edad?:"+mayorEdad );
		entrada.close();
		
		

	}

}

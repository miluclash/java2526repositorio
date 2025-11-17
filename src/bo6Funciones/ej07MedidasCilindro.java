/*Realizar una función que calcule (muestre en pantalla) el área o el volumen de un cilindro, según
se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v'
(para el volumen). Además hemos de pasarle a la función el radio y la altura.*/

package bo6Funciones;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ej07MedidasCilindro {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double r,h;
		char opcion;//r=radio,h=altura,a=area,v=volumen
		try {
		System.out.print("Ingrese el radio de la base del cilindro: ");
		r=sc.nextDouble();
		System.out.print("Ingrese la altura del cilindro: ");
		h=sc.nextDouble();
		System.out.print("¿Qué quiere calcular?: ");
		opcion=sc.next().charAt(0);
		eleccion(r,h,opcion);
		sc.close();
		}catch(InputMismatchException iem) {
			System.out.println("introduce un valor válido.");
			sc.next();
		}
	}

	
	private static void eleccion(double r,double h, char opcion) {
		double vol,area;
		switch(opcion) {
		case 'v'-> {
			vol=Math.PI*r*r*h;
			System.out.println("El volumen del cilindro es: "+vol);}
		case'a'-> {
			area=2*Math.PI*r*(r+h);
			System.out.println("EL area del cilindro es: "+area);}
		default -> System.out.println("Indicador del cálculo erróneo");
		}
		
	}
}

package ejjavamichael;
import java.util.Scanner;
public class ejcuadradodesuma {

	public static void main(String[] args) {
		double result;
		double a,b;//variables que metemos
		Scanner entrada= new Scanner(System.in);
		System.out.print("Ingrese el valor a: ");
		a=entrada.nextDouble();
		System.out.print("Ingrese el valor b: ");
		b= entrada.nextDouble();
		result= Math.pow(a, 2)+2*a*b+Math.pow(b, 2);
		System.out.println("El cuadrado de la suma de a y b es: "+result);
		entrada.close();
		
		
		

	}

}

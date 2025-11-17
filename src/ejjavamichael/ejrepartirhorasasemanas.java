package ejjavamichael;
import java.util.Scanner;
public class ejrepartirhorasasemanas {

	public static void main(String[] args) {
			
		int horas,semanas,dias,horasTotales;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el numero de horas: ");
		horasTotales = entrada.nextInt();
		semanas=horasTotales/168;
		dias=horasTotales%168 / 24;
		horas= horasTotales%24;
		
		System.out.println("EL numero de semanas es: "+semanas);
		System.out.println("el numero de dias es: "+dias);
		System.out.println("El numero de horas es: "+horas);
		
		entrada.close();
		
		
		
		
	
	}
}

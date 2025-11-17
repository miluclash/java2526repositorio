package ejjavamichael;
import java.util.Scanner;
public class ejes {

	public static void main(String[] args) {
		int horas;
		int horsemana;
		int salario;
		System.out.println("Ingrese las horas trabajasdas a la semana: ");
		Scanner entrada = new Scanner(System.in);
		horas = entrada.nextInt();
		System.out.println("Ingrese su pago de dinero por horas: ");
		horsemana = entrada.nextInt();
		salario = horas*horsemana;
		System.out.println("El salario por semana es: "+salario);
		entrada.close();
	}

}

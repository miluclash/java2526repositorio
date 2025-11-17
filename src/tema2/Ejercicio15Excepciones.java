package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio15Excepciones {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Introduzca un numero: ");
		int num1=sc.nextInt();
		System.out.println("Introduzca un numero. ");
		int num2=sc.nextInt();
		int result = num1/num2;
		System.out.println("Rsultado: "+result);
		sc.close();
		}  catch(ArithmeticException ae1) {//<-nombre variable de la excepcion) {
			System.out.println("No es puede dividir por cero: "+ae1.getMessage());
			//ae1.printStackTrace();
		} catch (InputMismatchException ime) {
			System.out.println("Debe ser entero. "+ime.getMessage());
		}
		catch (Exception ex) {
			System.out.println("Error general"+ex.getMessage());
		}
		finally {
			System.out.println("simepre se ejecuta.");
			sc.close();	
		}
	}

}

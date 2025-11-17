package ejjavamichael;
import java.util.Scanner;
public class ej1 {

	public static void main(String[] args) {
		float nota1, nota2, nota3,suma;
        Scanner entrada= new Scanner(System.in);
        //se puede poner una sola vez el systemo.out y escribir las tres ntoas seguidas con un espacio entre ellas.
        System.out.print("Escribe la primera nota: ");
        nota1= entrada.nextFloat();
        System.out.print("Escribe la segunda nota: ");
        nota2= entrada.nextFloat();
        System.out.print("Escribe la tercera nota: ");
        nota3= entrada.nextFloat();
        suma = nota1+nota2+nota3;
        System.out.print("La suma de las tres notas es: "+suma);
        entrada.close();

	}

}

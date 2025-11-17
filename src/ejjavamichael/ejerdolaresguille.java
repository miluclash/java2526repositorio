package ejjavamichael;
import java.util.Scanner;

public class ejerdolaresguille {

	public static void main(String[] args) {
		
		int n ;//n es la variable del numero de dolares que tiene guillermo
		int l;//l de Luis
		int j;//j de Juan
		int suma;
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("¿Cuantos dolares tiene Guillermo?: ");
		n= entrada.nextInt();
		l=n/2;
		j=(l+n)/2;
		suma= j+n+l;
		System.out.println("La suma del dinero de los tres es de: "+suma);
		entrada.close();
		
		

	}

}

package tema2;

public class Ejercicio12For {

	public static void main(String[] args) {
		// Pintar los primeros 10 numeros
		
		for(int i =1; i<10; i++) {
			System.out.println(i+" ");
		}
		//cuenta regrresiva descendente del 1 al 10
		for (int i=10; i>0; i--) {
			System.out.println(i+" ");
		}
		System.out.println(" ");
		//10  numeros pares
		for (int i=0; i<=20; i+=2) {
			System.out.println(i+" ");
		}	
		//sumar los primeros 100 numeros
		int suma=0;
		for (int i=0; i<=100; i++) {
			suma+=i;
		} 
		System.out.println("\nsuma="+suma);
		
		//Bucles ANIDADOS(un blucle dentro de otro bucle)
		for (int i=1; i <=3 ; i++) {
			for(int j=1; j <=3; j++) {
				System.out.print("("+i+","+j+")");
			}
		}
	}

}

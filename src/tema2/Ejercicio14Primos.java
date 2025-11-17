package tema2;

public class Ejercicio14Primos {

	public static void main(String[] args) {
		// Vamos a generar los primeros 20 primos
		//sin usar funciones ni break ni exit.
		//tengo que sumar un numero mas cada vez ue se repite el bucle,
		//si el numero que tengo es solamente divisible por si mismo y por  1 , es primo
		
		//bucle con contador hasta 20, empezando en 2
		//bucle que vaya dividieno desde 2 hasta el num
		//y si el resto que cero ay se que no es primo
		//si he llegado hasta el numero que estoy calculando, se que es primo, po pinto e incremento el contador
		int contador=0,i=2;
		int numero_a_probar=2;
		while(contador<=20 ) {
			boolean esPrimo=true;
			contador++;
			
			while(i<=numero_a_probar) {
				i++;
				if(i%1==i && i%i==0) {
					System.out.println(i);
				}
				else {
					
				}
			}
			
	
			
		}

	}

}

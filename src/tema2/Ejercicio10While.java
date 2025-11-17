package tema2;

public class Ejercicio10While {

	public static void main(String[] args) {
		//pintar los 5 primeros numeros
		/*int contador=5;
		while(contador<6) {
			System.out.println("contador= "+contador);
			contador++;
		}*/
		
		//Primeros 10 numeros pares.
		/*int contador1=0;
		while(contador1<=20) {
			if(esPar())
			System.out.println("Contador= "+contador1);
			contador1+=2;*/
		int contador2=0;
		while( contador2<=20) {
			if(esPar(contador2)) {
				System.out.println("Contador= "+contador2);
				
			}
			contador2++;
		}
	int contador3;
	String cad="Hola";
	contador3=1;
	while (contador3 <=5) {
		cad+=contador3;
		contador3++;
	}
	System.out.println("Contador: "+contador3);
	
	
	}
	
//primero 10 pare usando boolean
	private static boolean esPar(int iNum) {
		return iNum % 2==0;
				
	}
}

//EJERCICO MODELO EXAMEN PROGRAMACION
package tema2;
import java.util.Scanner;
public class EjercicioVueltaCiclista {

	public static void main(String[] args) {
		int diarydist,sumadiary=0,checkpoint=0,totaldist;
		Scanner sc =new Scanner(System.in);
		
		while(true) {//Para que el programa comienze con el bucle, y para no tener la variable diarydist como condicion
			//(porque haciendolo asi deberia inicializarla antes y solo quiero que acepte los numero que le meto) y salimos con un break
			System.out.print("Introduce km recorridos (0 para terminar): ");
			diarydist=sc.nextInt();	
		 if(diarydist>=30) {
			System.out.println("No se pueden recorrer mas de 30 km diarios.");
			continue;
		} 
		if(diarydist==0) {
				break;}
		checkpoint=checkpoint+diarydist;//va sumando los nuevos hitos para obtener la distancia de ida de un dia especifico
		sumadiary+=checkpoint;//va sumando cada distancia recorrida de ida de cada dia para asi obtener la distancia total
		}//fin while
		
		totaldist=sumadiary*2;
		System.out.println("Distancia total(ida y vuelta): "+totaldist);
		sc.close();
}
}
//1-Pedir el numero
//2- Comprobar si es 0, si lo es enseñar distancia total
//3- Si no es 0, multiplicar el numero *2 y guardar en totaldist
//4- Volver a pedir numero y vovler a comprobar si es 0, si lo es, enseñar lo guardado en totaldist.
//5- Si no es 0,multiplicar *2 y sumar al anterior valor de totaldist.
//6-Repertir hasta que meta un cero.


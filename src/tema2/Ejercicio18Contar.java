//Programa que genra 100 numeros aleatorios y muestra
//1- Cuantos pares hay
//2-Cuantos primos hay
package tema2;
import java.util.Scanner;
import java.util.Random;;
public class Ejercicio18Contar {

	public static void main(String[] args) {
		int pares=0,primos=0,n;
		int dividendo,divisor=1;
		boolean primo=true;
		
		for(int i=100;i>0;i--) {
			Random nums= new Random();
			n=nums.nextInt(10000);//entre 0 y 9.999
			//System.out.println(n);
			if(n%2==0) {
				pares++;
			}//fin if
			
			if(Ejercicio14Primos3.funcionEsPrimo(n)) {
				primos++;
			}
			/*for(dividendo=n; divisor<=n; divisor++) {//Para esta parte podemos llamar a Ejercicio14Primos3.fucntionEsPrimo(numero))
														//para asi reutilizar codigo.
														///Aunque tambien se puede usar <-este codigo.
														 
				primo=true;
				while(divisor<=dividendo-1 && primo==true) {
					if(dividendo%divisor==0) {
						primo=false;
						}//fin if
						divisor++;	
				}//fin while
				primos++;*/
			}//fin for
		}//fin for
		/*System.out.println("Entre los 100 numeros aleatorios, hay "+pares+" numero que son pares.");
		System.out.println("Entre los 100 numeros aleatorios, hay "+primos+" numero que son primos.");*/
	}




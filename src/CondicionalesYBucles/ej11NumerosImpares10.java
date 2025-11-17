//. Diseñar un programa que muestre el producto de los 10 primeros números impares.

//los 10 primeros son 1,3,5,7,9,11,13,15,17,19. Todos tienen diferencia de dos. Por tanto solo habra que ir añadiendo +2 a 1 hasta que o haya hecho 10 vecesç
//y luegomultiplicar esos numeros y mostrarlos
package CondicionalesYBucles;

public class ej11NumerosImpares10 {

	public static void main(String[] args) {
		long producto=1;//es muy importante acordarse de inicializarlo a 1. Ya que si lo hacemos a 0,el producto siempre valdrá 0
		int i;
		
		for(i=1; i<=20; i+=2) {//lo hago 9 veces ya q si lo hago 10, llegara hasta el 21, y el decimo numimpar es el 19.Ademas, multiplicar por 1 da igual.
			producto=producto*i;
			
		}
		System.out.println("El producto se los primero 10 numeros impares es: "+producto);
			
	}

}

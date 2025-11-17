/*Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.*/

package bo3BuclesAnidados;
/*Quiero que ponga 10 filas de cada tabla y cada vez que se haga una multiplicacion,
 * se sume +1 al 2º numero hasta que llegue al 10.
 * Cuando llegue al 10, sumara +1 al 1er numero y repetira el proceso hasta que el 1er numero sea 10.
 * Necesito: nº de tabla, numero del 1er numero, 2º numero, resultado de la multiplicacion*/
public class ej03TablaMultiplicar {

	public static void main(String[] args) {
		int tabla,primerNum=0;
		int segundoNum;
		for (tabla=1;tabla<=10;tabla++) {
			primerNum++;
			System.out.println("Tabla del "+primerNum);
			System.out.println("-----------------------");
			for(segundoNum=1;segundoNum<=10;segundoNum++) {
				System.out.println(primerNum+" x "+segundoNum+" = "+primerNum*segundoNum);

			}System.out.println();
			
			
		}
	}

}

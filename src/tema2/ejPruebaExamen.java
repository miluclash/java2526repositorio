/*rea un programa en Java que permita gestionar la reserva de entradas para un teatro. El programa debe permitir al usuario:

Ver los días disponibles para funciones (Martes a Domingo).

Seleccionar un día y reservar una cantidad de entradas.

Validar que la cantidad de entradas no exceda el máximo permitido por día (por ejemplo, 100 entradas).

Repetir el proceso hasta que el usuario decida salir.

Mostrar un resumen final con las reservas realizadas por día.*/


/*Para ver los dias disponible hare una variable que guarde las entradas disponibles de cada dia
 * Uso un switch para elegir el dia que quiero las entradas. Cuando elija un dia que tiene entradas restantes verificar que no paso de las 100 entradas(con un if)
 * Todo esto estara dentro un bucle: muestro dias, elijo entradas, compruebo, vuelvo a pedir si se quiere hacer otra reserva y así hasta que decida elegir "SALIR".
 * Cuando salga (del bucle) debo mostrar un resumen donde esten todas las entradas que se han comprado
 * 
 * USO: VARIABLES: para guardar el numero de entradas compradas cada dia(variables independientes);
 * 		SWITCH	: para tener el menu de eleccion de cada dia;
 * 		if : dentro del switch para que cuando elija un dia se guarden los datos dentro de ese dia.Lo mejor sera que use una funcion con la que se elija el dia
 * 		y segun que dia elija usare otro switch para seleccionar el dia donde quiero guardar las entradas(en su respectiva variable).
 * 			- al final de cada compra debe haber uno tambien que de a escoger entre si seguir comprando o salir de la compra
 * 			- puedo meter un primer if como control para que no se introduzca un numero fuera del rango
 * 		BUCLE WHILE: para repetir la accion de enseñar el menu.
 * */
package tema2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejPruebaExamen {

	public static void main(String[] args) {
		int dia=1;//donde elijo el numero del dia.
		int entradas=0;//numero de entradas.
		int martes,miercoles,jueves,viernes,sabado,domingo;martes=miercoles=jueves=viernes=sabado=domingo=0;//donde guardo las entradas comprads con sus respectivos dias
		boolean continuar=true;
		char eleccion='s';
		Scanner sc=new Scanner(System.in);
		System.out.println("Bienvenido al sistema de reservas del Teatro Central.\r\n"
				+ "Días disponibles:\r\n"
				+ "0 - Martes\r\n"
				+ "1 - Miércoles\r\n"
				+ "2 - Jueves\r\n"
				+ "3 - Viernes\r\n"
				+ "4 - Sábado\r\n"
				+ "5 - Domingo");
		System.out.println();
		try {
		while(continuar) {
		System.out.print("Ingrese el número del día: ");
		dia=sc.nextInt();
		if(dia<0 ||dia>5) {
			System.out.println("DIA NO VALIDO");
			continue;
		}
		
		System.out.println("Cuantas entradas quiere reservar?: ");
		entradas=sc.nextInt();
		if (entradas <= 0) {
            System.out.println("❌ La cantidad debe ser mayor que cero.");
            continue;
        }
		if(entradas>100) {
			System.out.println("Error, no se pueden reservar mas de 100.");
			continue;
		}else {
			switch(dia) {
			case 0 ->martes=entradas;
			case 1 -> miercoles =entradas;
			case 2 -> jueves=entradas;
			case 3 ->viernes=entradas;
			case 4 -> sabado=entradas;
			case 5 ->domingo=entradas;
			}
			System.out.println("Reserva confirmada para "+diaElegido(dia));
		}
		System.out.println("¿Deseas hacer otra reserva?:(s/n) ");
		eleccion=sc.next().charAt(0);
		if(eleccion=='s')
			continuar=true;
		else if (eleccion=='n')
			continuar=false;
		

		}//fin while
		}catch(InputMismatchException iem) {
			System.out.println("Tipo de caracter no valido.");
			sc.nextInt();
		}
		System.out.println("Resumen final.");
		System.out.println("Martes: "+martes+" entradas");
		System.out.println("Miercoles: "+miercoles+" entradas");
		System.out.println("Jueves: "+jueves+" entradas");
		System.out.println("Viernes: "+viernes+" entradas");
		System.out.println("Sabado: "+sabado+" entradas");
		System.out.println("Domingo: "+domingo+" entradas");
		

	}
	private static String diaElegido(int i) {
		return switch (i) {
		case 0 -> " Martes ";
		case 1-> "Miercoles ";
		case 2 -> "Jueves ";
		case 3 -> "Viernes ";
		case 4-> "Sabado ";
		case 5 -> "Domingo ";
		default ->"Día no Válido.";
		};
	}

}


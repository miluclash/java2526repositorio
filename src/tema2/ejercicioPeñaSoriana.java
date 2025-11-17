package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioPeñaSoriana {

	public static void main(String[] args) {
		int recaudacion=0,mejorRecaudacion=0,peorRecaudacion=Integer.MAX_VALUE;
		String  mejorDia="0",peorDia="0";
		boolean domingo =false;
		String dia;
		int mediaSemana=0;//media de la semana que comparare con el domingo
		int recDomingo=0;//para guardar solo el domingo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la recaudadción de martes a domingo: ");
		try {
			for(int i=0;i<=5;i++) {
				System.out.print("Recaudación del "+diaSemana(i));
				recaudacion=sc.nextInt();
				if(recaudacion>mejorRecaudacion) {
					mejorRecaudacion=recaudacion;
					switch(i==0? 0:i==1? 1:i==2? 2:i==3? 3:i==4? 4:i==5? 5:6) {
					case 0 -> mejorDia="Martes";
					case 1-> mejorDia="Miercoles";
					case 2 -> mejorDia="Jueves";
					case 3 -> mejorDia="Viernes";
					case 4-> mejorDia="Sabado";
					case 5 -> mejorDia="Domingo";
					}
				}//fin if>
				else if(recaudacion<peorRecaudacion){
					peorRecaudacion=recaudacion;
				switch(i==0? 0:i==1? 1:i==2? 2:i==3? 3:i==4? 4:i==5? 5:6) {
				case 0 -> peorDia="Martes";
				case 1-> peorDia="Miercoles";
				case 2 -> peorDia="Jueves";
				case 3 -> peorDia="Viernes";
				case 4-> peorDia="Sabado";
				case 5 -> peorDia="Domingo";
				}
				}//fin if<
				
				if(i==5) {recDomingo=recaudacion;}
				
					mediaSemana+=recaudacion;
			}//fin for
			mediaSemana=mediaSemana/5;
			if(recDomingo>mediaSemana) {
				domingo=true;
			}else {
				domingo=false;
			}
			System.out.println("Mejor día: "+mejorDia);
			System.out.println("Peor día: "+peorDia);
			if(domingo==true) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
			
		}//fin try 
		catch(InputMismatchException iem ){
			System.out.println("NO VALIDO");
			sc.nextInt();	
		}catch (Exception ex) {
			System.out.println("Error general"+ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
private static String diaSemana(int i) {
		 return switch (i) {
		case 0 -> "Recaudación del Martes: ";
		case 1-> "Recaudacion del Miercoles: ";
		case 2 -> "Recaudacion de Jueves: ";
		case 3 -> "Recaudación del Viernes: ";
		case 4-> "Recaudacion del Sabado: ";
		case 5 -> "Recaudacion de Domingo: ";
		default ->"Día no Válido.";
		};
}
}



//1- Saco el texto de introudce de martes a domingo
//2-comineza un bucle(for) donde empieza en martes y se va sumando +1 y va guardando el valor
//3- cada vez que sume +1, cada numero del 0 al 5 se refiere a un dia de la semana(switch)
//4- A su vez, dentro del bucel debe haber un if donde vaya comparando el valor mas grande que he metido y el más pequeño, e
//ir cambiandolo cada vez que meto un valor mas grande que el anterior.
//5- Al final, cuadno llegue al Domingo, sacar el dia con mayor recaudacion, el menor , e indicar con el boolean si la Media de toda la semana(media)
//es superiror a la recaudacion del domingo(boolean domingo), y sacar true=SI; false=NO.

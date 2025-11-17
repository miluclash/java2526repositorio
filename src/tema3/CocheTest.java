package tema3;

public class CocheTest {

	public static void main(String[] args) {
		//Creamos un chche de la clase ClaseCoche
		
		ClaseCoche cocheAlexander= new ClaseCoche("negro",250,2.5);
		System.out.println(cocheAlexander.toString());
		
		ClaseCoche cocheWeikang = new ClaseCoche("Azul",170,3);
		System.out.println(cocheWeikang.toString());
		
		/*Alexander pinta el coche*/
		
		cocheAlexander.setColor("Amarillo");
		/*Para comprobar opcion 1:*/
		System.out.println(cocheAlexander.toString());
		
		//Opcion 2
		System.out.println("El nuevo color de coche es : "+cocheAlexander.getColor());
	}

}

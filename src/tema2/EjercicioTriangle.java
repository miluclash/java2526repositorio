//hacer una piramide de asteriscos
package tema2;

public class EjercicioTriangle {

	public static void main(String[] args) {
		
pintarTriangulo();
	}

	private static void pintarTriangulo() {
		//1-declaro variable para el numero de filas
		int filas=5;
		//2- primer for desde 1 hasra el numero de filas
				for(int i =1; i<=filas ; i++) {
		//3- pinat espacios en blanco para alinear el triangulo
					for (int j = filas; j<=i ; j--) {
						System.out.print(" ");
					}//fin for espacios
					for( int k=1; k<=5; k++) {
						System.out.print("*");
					}//fin for del asterisco
				//5-pintar salto de linea
					System.out.print("\n");	
				}//fin for i de filas	
		
	}	//fin pintarTraingulo()
}


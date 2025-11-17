package tema2;

public class EjercicioPiramideAstericos {

	public static void main(String[] args) {
		
pintarPiramide();
	}
	private static void pintarPiramide() {
		//1-declaro variable
		int filas=5;
		
		//2- primer for desde 1 hasta el numero de filas
		for (int i=0; i<=filas ;i++) {
			//pintar los espacios
			for(int j=filas; j>=i; j--) {
				System.out.println(" ");
			}//fin esapcios	
		
		for (int k=0; k<=2*i-1; k+=2) {
			System.out.println("*");
		}//fin asterisco
		//salto de linea
		System.out.println("\n");
		}
	}



}

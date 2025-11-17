package tema3;

public class LibroMichaelTest {

	public static void main(String[] args) {
		LibroMichael libro=new LibroMichael("La Brújula Dorada","Phillip Pulman",420);
		
		libro.mostrarInformacion();
		

		
		libro.leer(100);
		System.out.println("Has leido "+libro.getPaginasLeidas()+" de "+libro.getPaginasTotales());
		
		libro.leer(200);
		System.out.println("Has leido "+libro.getPaginasLeidas()+" de "+libro.getPaginasTotales());
		
		libro.leer(120);
		System.out.println("Has leido "+libro.getPaginasLeidas()+" de "+libro.getPaginasTotales());

		
		if(libro.estaTerminado()) {
			System.out.println("¡Has terminado el libro!");
		}else {
			System.out.println("Aún te quedan páginas por leer.");
		}
		
		System.out.println();
		System.out.println("Título: "+libro.getTitulo());
		
		System.out.println("Autor: "+libro.getAutor());
		
		System.out.println("Páginas totales: "+libro.getPaginasTotales()); 
		
		System.out.println("Páginas totales: "+libro.getPaginasLeidas()); 
		
	
	}

}

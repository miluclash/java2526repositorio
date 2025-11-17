package tema3;
/**
 * La Clase libro represetna un libro con título,autor y número de páginas. Permite realizar acciones como leer páginas y verificar si el libro ha sido terminado.
 * @autor Michael C.
 * @since 31-Oct-2025
 */
public class LibroMichael extends Object{
	/**Titulo del libro*/
	private String titulo;
	/**Autor del libro*/
	private String autor;
	/**Número de páginas del libro*/
	private int paginasTotales;
	/**Número de paginas leidas*/
	private int paginasLeidas;
	/**
	 * Constructor de la clase LibroMichael	
	 * @param titulo-Titulo del libro
	 * @param autor-Autor del libro
	 * @param paginasTotales-Número de paginas del libro.
	 * @param paginasLeidas-Número de paginas leidas del libro.
	 */
	public LibroMichael(String titulo,String autor, int paginasTotales){/*CONSTRUCTOR*/
		this.titulo=titulo;
		this.autor=autor;
		this.paginasTotales=paginasTotales;
	}
	
	/**
	 * Permite leer las páginas leídas del libro. Si se pasa del máximo número de páginas totales, se ajusta automaticamente al número de páginas
	 * totales.
	 * @param paginas Páginas leídas.
	 */
	public void leer(int paginas) {
		if(paginas>paginasTotales) {
			paginas=paginasTotales;
		}else {
			paginasLeidas+=paginas;
		}
	}
	
	/**
	 * Verifica si se ha terminado el libro.
	 * @return-true si se han leído todas las páginas del libro, false en caso contrario.
	 */
	public boolean estaTerminado() {
		return paginasLeidas==paginasTotales;
	}
	
	/**
	 * Muestro por pantalla el título y el autor del libro.
	 */
	public void mostrarInformacion() {
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Páginas totales: "+paginasTotales);
		System.out.println("Páginas leídas: "+paginasLeidas);

	}
	
	/**
	 * Muestra el título del libro.
	 * @return-Titulo del libro.
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	/**
	 * Muestra el nombre del autor del libro.
	 * @return-Autor del libro.
	 */
	public String getAutor() {
		return this.autor;
	}
	
	/**
	 * Devuelve el número de páginas del libro.
	 * @return-Paginas totales del libro.
	 */
	public int getPaginasTotales() {
		return this.paginasTotales;
	}
	
	/**
	 * Devuelve el número de páginas leídas hasta el momento.
	 * @return-Paginas leidas del libro.
	 */
	public int getPaginasLeidas() {
		return this.paginasLeidas;
	}
	

	
	
	

	
}

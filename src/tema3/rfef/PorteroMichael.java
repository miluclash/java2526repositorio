package tema3.rfef;


public class PorteroMichael {
	private String nombre;
	private int edad;
	private int golesRecibidos;
	public PorteroMichael(String nombre, int edad, int golesRecibidos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.golesRecibidos = golesRecibidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getGolesRecibidos() {
		
		return golesRecibidos;
	}
	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	
	public String toString() {
		return "Portero { "+"nombre='" + nombre +"', edad= " + edad +", Goles Recibidos= " + golesRecibidos + "}";

}
}

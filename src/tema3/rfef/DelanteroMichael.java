package tema3.rfef;

public class DelanteroMichael {
	private String nombre;
	private int edad;
	private int golesAnotados;
	
	public DelanteroMichael(String nombre, int edad, int golesAnotados) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.golesAnotados = golesAnotados;
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
	public int getGolesAnotados() {
		return golesAnotados;
	}
	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}
	
	public String toString() {
	    return "Delantero { "+"nombre='" + nombre +"', edad= " + edad +", Goles Anotados= " + golesAnotados + "}";
	    }

}

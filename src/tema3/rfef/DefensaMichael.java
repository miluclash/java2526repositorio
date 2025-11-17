package tema3.rfef;

public class DefensaMichael {
	
	private String nombre;
	private int edad;
	private int penaltisCometidos;
	
	public DefensaMichael(String nombre, int edad, int penaltisCometidos){
		this.nombre=nombre;
		this.edad=edad;
		this.penaltisCometidos=penaltisCometidos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public int getPenaltisCometidos() {
		return penaltisCometidos;
	}
	
	public void setPenaltisCometidos(int penaltisCometidos) {
		this.penaltisCometidos=penaltisCometidos;
	}

	public String toString() {
	    return "Defensa { "+"nombre='" + nombre +"', edad= " + edad +", Penaltis Cometido= " + penaltisCometidos + "}";

	}
}

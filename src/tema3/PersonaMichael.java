package tema3;

public class PersonaMichael {
	
	private String paramNombre;
	private byte paramEdad;
	private double paramEstatura;
	
	public PersonaMichael(String paramNombre,byte paramEdad, double paramEstatura) {
		this.paramNombre=paramNombre;
		this.paramEdad=paramEdad;
		this.paramEstatura=paramEstatura;
	}
	
	public void crecer(double incremento) {
		incremento+=incremento;
	}
	public void cumplirAnyos() {
		this.paramEdad++;
	}
	public byte getEdad() {
		return this.paramEdad;
	}
	
	public double getEstatura() {
		return this.paramEstatura;
	}
	
	public String getNombre() {
		return this.paramNombre;
	}
	public void saludar() {
		System.out.println("Hola. Mi nombre es "+paramNombre);
		System.out.println("Encantado de conocerte");
	}
	public void setEdad(byte Edad) {
		this.paramEdad=Edad;
	}
	public void setEstatura(double estatura) {
		this.paramEstatura=estatura;
	}
	
	public void setNombre(String nombre) {
		this.paramNombre=nombre;
	}
	public String toString() {
		return  "Persona [nombre="+paramNombre+", edad="+paramEdad+" ,estatura="+paramEstatura+"]";
	}
	
	
	
}

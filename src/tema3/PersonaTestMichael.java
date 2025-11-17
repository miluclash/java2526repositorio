package tema3;

public class PersonaTestMichael {
public static void main(String[] args) {
	PersonaMichael alumnoDAW = new PersonaMichael("Michael", (byte) 19, 1.76);
	System.out.println("Datos del alumnoDAW=" + alumnoDAW+"\n");//alumnoDAW a secas es igual como si hubiera alumnoDAW.toString();
	//Vemos el saludo de Michael
	alumnoDAW.saludar();
	//Michael cumple Años
	alumnoDAW.cumplirAnyos();
	//Y ha crecido
	alumnoDAW.crecer(0.05);
	//Volvemos a ver los datos de Michael
	System.out.println("\nDatos del alumnoDAW=" + alumnoDAW+"\n");
	//Han pasado dos años
	alumnoDAW.setEdad( (byte)22);
	//Y ha crecido un poco más
	alumnoDAW.setEstatura(1.83);
	//Y ahora nos piden guardar también el apellido
	alumnoDAW.setNombre("Michael Criollo");
	//Mostramos los nuevos datos
	System.out.println("Datos con cambios");
	System.out.println("Nombre:"+alumnoDAW.getNombre());
	System.out.println("Edad:"+alumnoDAW.getEdad());
	System.out.println("Estatura:"+alumnoDAW.getEstatura());

	}
}

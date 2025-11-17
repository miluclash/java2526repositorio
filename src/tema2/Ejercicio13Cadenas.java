package tema2;

public class Ejercicio13Cadenas {

	public static void main(String[] args) {
		String str1= "name";
		String str2= "name";
		String str3= new String("name");
		String str4= "Name";
		str1.equals(str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3); //sale false porque ocupan diferentes zonas de memoria.
		//ahora el 1 y 4 
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str4));//ignora si es mayuscula o minuscula
		
	}

}

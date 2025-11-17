package tema3;

public class ClaseCoche {

		//Toda clase Java debe tener 
		/*1- Atributos*/
		private String color;
		private int velocidad;
		private double tamanyo;
		
		/*2-Constrcutor : se tiene que llamar como la clase y 
		 * el metodo debe ser publico.*/

		public ClaseCoche(String paramColor, int paramVelocidad, double paramTamanyo) {
			
			this.color=paramColor;
			this.velocidad=paramVelocidad;
			this.tamanyo=paramTamanyo;

		}
		
		public ClaseCoche() {}
		
		public ClaseCoche(String elColorDeIncio) {
			 
		}
		/*3- Métodos: acciones que puede realizar*/
		public void avanzr() {};
		public void parar() {};
		public void girarIzquierda() {};
		public void girarDerecha() {};
		
		
		
		/*4- Getter y Setter*/
		public void setColor(String sNuevoColor) {
			this.color=sNuevoColor;//seter
		}
		
		//si solo quiero que me devuelva el color de un coche
		//uso otro metodo que me devuelva el color
		
		public String getColor() {
			return this.color;//geter
		}
		/*faltan los otros 2 atributos*/

		
		/*Pintar el objeto por pantalla*/
		public String toString() {
			return("Mi coche tiene color "+color+" y velocidad "+velocidad+
					" y tamaño "+tamanyo);
		}



}

package tema3;

public class ejCuentaBancaria {


		private String titular;
		private double saldo;
		
		public ejCuentaBancaria(String titular, double saldo){/*CONSTRUSTOR*/
			this.titular=titular;
			this.saldo=saldo;
		}
		public String toString() {
			return("El titular "+titular+" tiene un saldo de: "+saldo);
		}
		public void ingresar( double saldo) {
			if(saldo>0) {
				saldo+=saldo;
			}else {	
			}
		}

		public void retirar(double saldo) {
			if(saldo>0) {
				saldo-=saldo;
			}
		}

		public double consultarSaldo(double saldo) {
			return this.saldo;
		}

		public String getTitular() {
			return this.titular;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
}






//PARA HACER UN MÉTODO:
//1- Visibilidad: public/private
//2- Nombre de la clase: CuentaBancaria
//3- Atributos: titular,saldo
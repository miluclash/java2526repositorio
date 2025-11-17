package tema3;

/**
 * Clase CuentaBancariaStatic que crea cuentas bancarias con atributo estatico.
 * creada por
 * @author michael
 * @since 31-Oct-2025
 * 
 * 
 */
public class CuentaBancariaStatic {
	/*Titular de la cuenta*/
	private String titular;
	/*Saldo de la cuenta*/
	private double saldo;
	//Crea un atributo estatico para contar el numero de cuentas
	/**atributo estatico para el numero de cuentas*/
	private static int n=0;
	
	//Constructor para inicializar la cuenta
	/**Cosntructor de la clase . Incremetnata el numero de cuentas
	 * 
	 * @param titular
	 * @param saldo
	 */
	public CuentaBancariaStatic(String titular, double saldo){/*CONSTRUSTOR*/
		this.titular=titular;//asigno al atributo "titular" el valor del parametro "titular( que viene del ejericicio)"
		this.saldo=saldo;
		CuentaBancariaStatic.incCuentas();//solo puedo llamar a un metodo dentro del CONSTRUCTOR  SOLO SI EL METODO ES STATIC
	}
	
	@Override
	
	public String toString() {//metodo toString(); para pintar
		return("El titular "+titular+" tiene un saldo de: "+saldo);//titular y saldo tiene el valor que reciben de CuentaBancariaTest.
	}
	/***
	 * 
	 * @param saldo
	 */
	public void ingresar( double saldo) {//metodo ingresar al que le llega el valor saldo y guarda ese valor en el parametro saldo 
			this.saldo+=saldo;
	}
	/***
	 * 
	 * @param saldo
	 */
	public void retirar(double saldo) {//metodo retirar al que le llega el valor saldo y guarda ese valor en el parametro saldo 
			this.saldo-=saldo;
	}

	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public static void incCuentas() {
		CuentaBancariaStatic.n++;
	}
	public static int getCuentas() {
		return CuentaBancariaStatic.n;
	}
	
}

package tema3;

import tema3.ejCuentaBancaria;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		ejCuentaBancaria miCuenta=new ejCuentaBancaria("Michael Criollo",1000);
		miCuenta.ingresar(500);
		miCuenta.retirar(200);
		System.out.println("El saldo actual de "+miCuenta.getTitular()+" es: "+miCuenta.getSaldo());
		System.out.println("El saldo de la cuenta de Michael es de : "+miCuenta.toString());
		
	}

}

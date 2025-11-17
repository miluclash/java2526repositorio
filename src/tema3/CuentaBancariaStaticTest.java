package tema3;

public class CuentaBancariaStaticTest {

	public static void main(String[] args) {
		CuentaBancariaStatic cuentaMichael=new CuentaBancariaStatic("Michael",1000);//aqui meto los valores que en la clase seran los parametros
		CuentaBancariaStatic cuentaMichael2=new CuentaBancariaStatic("Michael",2000);
		CuentaBancariaStatic cuentaMichael3=new CuentaBancariaStatic("Michael",1500);
		
		cuentaMichael.ingresar(200);
		System.out.println("Se ha ingresado 200. Saldo actual: "+cuentaMichael.getSaldo());//incremento saldo en la subclase cuentaMichael
		cuentaMichael2.retirar(100);
		System.out.println("Se ha retirado 100. Saldo actual: "+cuentaMichael2.getSaldo());//retiro saldo en la subclase cuentaMichael2
		cuentaMichael3.retirar(10);
		System.out.println("Se ha retirado 100. Saldo actual: "+cuentaMichael3.getSaldo());//retiro saldo en la subclase cuentaMichael3
		System.out.println("El total de cuentas creadas es de: "+CuentaBancariaStatic.getCuentas());//de la clase CuentaBancariaStatic uso el metodo getCuentas();
		

	}

}

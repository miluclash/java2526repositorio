//Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
//facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
//precio por litro.
//Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
//y cuantas facturas se emitieron de más de 600 €.


package CondicionalesYBucles;

import java.util.Scanner;
public class ej17GestionFactura {

	public static void main(String[] args) {
		int codigo; // el código del artículo en cada factura
		 int cantidadLitros; // la cantidad de litros en cada factura
		 float precio; // el precio por litro en cada factura
		 float importeFactura; // guardará el importe de la factura con la que estemos trabajando
		 float facturacionTotal; // el importe de todas las facturas
		 int litrosCod1; // el total de litros vendidos del producto 1 en todas las facturas
		 int masDe600; //facturas de mas de 600
		 Scanner sc= new Scanner(System.in);
		 facturacionTotal = 0;
		 litrosCod1 = 0;
		 masDe600 = 0;
		 
		 
		 
		 // metemos comprobador
		 
		 for ( int i=1; i<=5; i++) {
			 System.out.println();
			 System.out.println("Factura nº:"+i);
			 System.out.println("Ingrese el codigo de cada producto: ");
			 codigo=sc.nextInt();
			 System.out.println("Ingrese la cantidad de litros vendidos: ");
			 cantidadLitros=sc.nextInt();
			 System.out.println("Ingrese el precio por litro: ");
			 precio= sc.nextFloat();
			 importeFactura=cantidadLitros*precio;
			 System.out.println("Facturacion total: "+importeFactura);
			 facturacionTotal+=importeFactura;
			 if(codigo==1);
				 litrosCod1=cantidadLitros;
			 if( importeFactura>=600);
				masDe600++; 
		 }
		 System.out.println("\n\n\nResumen de ventas\n");
		 // facturación total
		 System.out.println("La facturación total es de: " +facturacionTotal + "€");
		 System.out.println("Cantidad de litros vendida del producto 1: "+litrosCod1+" litros");
		 System.out.println("Facturas mayores a 600 euros: "+masDe600);

		 sc.close();
	}

}

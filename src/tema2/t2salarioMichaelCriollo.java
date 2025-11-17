package tema2;
import java.util.Scanner;
public class t2salarioMichaelCriollo {

	public static void main(String[] args) {
		int tarifa,horas;
		double dbruto,taxes = 0,neto;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Horas trabajadas esta semana: ");
		horas=sc.nextInt();
		System.out.println("Precio hora tarifd normal: ");
		tarifa=sc.nextInt();
		
		if(horas<0) {
			System.out.println("Ingresa horas mayores que 0");
			//return
		}
		if (tarifa<0) {
			System.out.println("Ingresa una tarifa valida.");
			//return
		}
		
		
		if(horas>=35) {
			dbruto= (35*tarifa)+((horas-35)*tarifa*1.5);
		}else {
			dbruto=horas*tarifa;
		}
		
		if (dbruto<=500) {
			
		} else if(dbruto>500 && dbruto<=900) {
			taxes=(dbruto-500)*0.25;
			
		} else if (dbruto>900){
			taxes= ((dbruto-900)*0.45)+(400*0.25);
			
		}
		neto=dbruto-taxes;
		
		System.out.println("El salario bruto es: "+dbruto);
		System.out.println("Los impuestos son: "+taxes);
		System.out.println("El salario neto(salario-impuestos) es: "+neto);
	
		sc.close();
		
	}

}

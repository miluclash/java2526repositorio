/*Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.*/

package bo3BuclesAnidados;

public class ej03ContadorSustituye3 {

	public static void main(String[] args) {
		int i,j,k,l,m;
		for(i=0;i<=9;i++) {
			for(j=0;j<=9;j++) {
				for(k=0;k<=9;k++) {
					for(l=0;l<=9;l++) {
						for(m=0;m<=9;m++) {
							if(i==3)
								 System.out.print("E");
								 else
								 System.out.print(i);
								 if(j==3)
								 System.out.print("E");
								 else
								 System.out.print(j);
								 if(k==3)
								 System.out.print("E");
								 else
								 System.out.print(k);
								 if(l==3)
								 System.out.print("E");
								 else
								 System.out.print(l);
								 if(m==3)
									 System.out.print("E");
								 else
								 System.out.print(m);
								 System.out.println(" ");
						}
						
					}
					
				}
				
			}
			
		}
	}

}

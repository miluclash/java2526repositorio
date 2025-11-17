package tema3.rfef;

import java.time.LocalDate;

public class EquipoFutbolTestMichael {
	public static void main(String[] args) {
		
		LocalDate fechaFundacion = LocalDate.of(2006, 3, 6);
		EntrenadorMichael entrenador= new EntrenadorMichael("Victor Fernades Fuentes",32,12,6);
		
		PorteroMichael porteroTitular =new PorteroMichael("Fran Pablos",21,7);
		
		DefensaMichael central1 = new DefensaMichael("C. Guerrero",31,1);
		DefensaMichael central2 = new DefensaMichael("Alejandro Magno",21,5);
		DefensaMichael interiorIzq = new DefensaMichael("Joaquin Diaz",29,2);
		DefensaMichael interiorDcha = new DefensaMichael("Joaquin Diaz",29,2);
		
		CentrocampistaMichael centrocampista1 = new CentrocampistaMichael("A. Agustin",26,12);
		CentrocampistaMichael centrocampista2 = new CentrocampistaMichael("S. Garcia",25,15);
		CentrocampistaMichael centrocampista3 = new CentrocampistaMichael("H. Herraiz",28,6);
			
		DelanteroMichael extremoIzq= new DelanteroMichael("Miguel Coperias",23,2);
		DelanteroMichael extremoDcha= new DelanteroMichael("J. Vicente",31,4);
			
		DelanteroMichael delanteroCentro= new DelanteroMichael("A. Carrillo",29,1);
		
		EquipoFutbolMichael equipo=new EquipoFutbolMichael("ED Moratalaz","Madrid","Urbis",fechaFundacion,entrenador,
			porteroTitular,central1,central2,interiorIzq,interiorDcha,
			centrocampista1,centrocampista2,centrocampista3,extremoIzq,extremoDcha,delanteroCentro,85);
		
		System.out.println(equipo);
		
		
	}

}

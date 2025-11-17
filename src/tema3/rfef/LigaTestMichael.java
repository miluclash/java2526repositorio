package tema3.rfef;

import java.time.LocalDate;

public class LigaTestMichael {
	public static void main(String[] args) {
		LocalDate fechaFundacion1 = LocalDate.of(2006, 3, 6);
		EntrenadorMichael entrenador1= new EntrenadorMichael("Victor Fernades Fuentes",32,12,4);
		
		PorteroMichael porteroTitular1 =new PorteroMichael("Ignacio Gómez",25,0);
		
		DefensaMichael central1 = new DefensaMichael("C. Guerrero",31,0);
		DefensaMichael central12 = new DefensaMichael("Alejandro Garcia",21,0);
		DefensaMichael interiorIzq1 = new DefensaMichael("Roncero Ronto",29,0);
		DefensaMichael interiorDcha1 = new DefensaMichael("Romero Villalar",29,0);
		
		CentrocampistaMichael centrocampista1 = new CentrocampistaMichael("Neymar JR.",26,0);
		CentrocampistaMichael centrocampista12 = new CentrocampistaMichael("L. Messi",25,0);
		CentrocampistaMichael centrocampista13 = new CentrocampistaMichael("C. Ronaldo",28,0);
			
		DelanteroMichael extremoIzq1= new DelanteroMichael("Miguel Coperias",23,0);
		DelanteroMichael extremoDcha1= new DelanteroMichael("J. Vicente",31,0);
			
		DelanteroMichael delanteroCentro1= new DelanteroMichael("Javier Rosario",29,0);
		
		EquipoFutbolMichael equipo1=new EquipoFutbolMichael("ED Moratalaz","Madrid","Urbis",fechaFundacion1,entrenador1,
			porteroTitular1,central1,central12,interiorIzq1,interiorDcha1,
			centrocampista1,centrocampista12,centrocampista13,extremoIzq1,extremoDcha1,delanteroCentro1,0);
		
/*------------------------------------------------------------------------------------------------------------------------------*/
		LocalDate fechaFundacion2 = LocalDate.of(2006, 3, 6);
		EntrenadorMichael entrenador2= new EntrenadorMichael("Carlo Ancelotti",33,12,0);
		
		PorteroMichael porteroTitular2 =new PorteroMichael("Victor Pasamontes",23,0);
		
		DefensaMichael central2 = new DefensaMichael("Alejandro Martin",31,0);
		DefensaMichael central22 = new DefensaMichael("Alex Dominguez",21,0);
		DefensaMichael interiorIzq2 = new DefensaMichael("Joaquin Diaz",29,0);
		DefensaMichael interiorDcha2 = new DefensaMichael("Manuel Cano",29,0);
		
		CentrocampistaMichael centrocampista2 = new CentrocampistaMichael("J. Morgan",26,0);
		CentrocampistaMichael centrocampista22 = new CentrocampistaMichael("B. Benitez",25,0);
		CentrocampistaMichael centrocampista23 = new CentrocampistaMichael("H. Vázquez",28,0);
			
		DelanteroMichael extremoIzq2= new DelanteroMichael("Jhonatan Arias",23,0);
		DelanteroMichael extremoDcha2= new DelanteroMichael("K. Vicente",31,0);
			
		DelanteroMichael delanteroCentro2= new DelanteroMichael("Alejandro Nieto",29,0);
		
		EquipoFutbolMichael equipo2=new EquipoFutbolMichael("FC ARTILLEROS","Madrid","Urbis",fechaFundacion2,entrenador2,
			porteroTitular2,central2,central22,interiorIzq2,interiorDcha2,
			centrocampista2,centrocampista22,centrocampista23,extremoIzq2,extremoDcha2,delanteroCentro2,0);
		
/*------------------------------------------------------------------------------------------------------------------------------*/

		LocalDate fechaFundacion3 = LocalDate.of(2006, 3, 6);
		EntrenadorMichael entrenador3= new EntrenadorMichael("Luis Enrique",34,12,3);
		
		PorteroMichael porteroTitular3 =new PorteroMichael("Thomas Wissler",22,0);
		
		DefensaMichael central31 = new DefensaMichael("C. Guerrero",31,0);
		DefensaMichael central32 = new DefensaMichael("Alejandro T.",21,0);
		DefensaMichael interiorIzq3 = new DefensaMichael("R. Diaz",29,0);
		DefensaMichael interiorDcha3 = new DefensaMichael("Darwin Nuñez",29,0);
		
		CentrocampistaMichael centrocampista31 = new CentrocampistaMichael("A. Parques",26,0);
		CentrocampistaMichael centrocampista32 = new CentrocampistaMichael("Ñ. Garcia",25,0);
		CentrocampistaMichael centrocampista33 = new CentrocampistaMichael("H. Ferrer",28,0);
			
		DelanteroMichael extremoIzq3= new DelanteroMichael("M. Criollo",23,0);
		DelanteroMichael extremoDcha3= new DelanteroMichael("M. Guaita",31,0);
			
		DelanteroMichael delanteroCentro3= new DelanteroMichael("Miguel Gallardo",29,0);
		
		EquipoFutbolMichael equipo3=new EquipoFutbolMichael("CD ENCUENTRO","Madrid","Urbis",fechaFundacion3,entrenador3,
			porteroTitular3,central31,central32,interiorIzq3,interiorDcha3,
			centrocampista31,centrocampista32,centrocampista33,extremoIzq3,extremoDcha3,delanteroCentro3,0);
		
/*------------------------------------------------------------------------------------------------------------------------------*/
		
		LocalDate fechaFundacion4 = LocalDate.of(2006, 3, 6);
		EntrenadorMichael entrenador4= new EntrenadorMichael("Zinedine Zidane",21,12,6);
		
		PorteroMichael porteroTitular4 =new PorteroMichael("Victor Fernández",21,0);
		
		DefensaMichael central41 = new DefensaMichael("C. Burgos",31,0);
		DefensaMichael central42 = new DefensaMichael("Alejandro L.",21,0);
		DefensaMichael interiorIzq4 = new DefensaMichael("J. Diaz",29,0);
		DefensaMichael interiorDcha4 = new DefensaMichael("Jocao Torres",29,0);
		
		CentrocampistaMichael centrocampista41 = new CentrocampistaMichael("A. Agustin",26,0);
		CentrocampistaMichael centrocampista42 = new CentrocampistaMichael("Sebastian Munevar",25,0);
		CentrocampistaMichael centrocampista43 = new CentrocampistaMichael("Daniel Lopez",28,0);
			
		DelanteroMichael extremoIzq4= new DelanteroMichael("Javier Alguacil",23,0);
		DelanteroMichael extremoDcha4= new DelanteroMichael("Juan Carlos",31,0);
			
		DelanteroMichael delanteroCentro4= new DelanteroMichael("Unai Fueyo",29,0);
		
		EquipoFutbolMichael equipo4=new EquipoFutbolMichael("FC CUÑA VERDE","Madrid","Urbis",fechaFundacion4,entrenador4,
			porteroTitular4,central41,central42,interiorIzq4,interiorDcha4,
			centrocampista41,centrocampista42,centrocampista43,extremoIzq4,extremoDcha4,delanteroCentro4,0);
/*------------------------------------------------------------------------------------------------------------------------------*/
		
		
		LigaMichael liga=new LigaMichael(equipo1,equipo2,equipo3,equipo4);
		
		System.out.println("\n****¡COMIENZA LA LIGA MORATALAZ!****");
		
		//Mostramos Equipos
		
		System.out.println(liga+"\n\n");
		
		//simulacion jornada
		
		liga.simularPartido(equipo1, equipo2);
		liga.simularPartido(equipo1, equipo3);
		liga.simularPartido(equipo1, equipo4);
		liga.simularPartido(equipo2, equipo3);
		liga.simularPartido(equipo2, equipo4);
		liga.simularPartido(equipo3, equipo4);
		
		System.out.println("\n***FINAL DE JORNADA***\n");
		System.out.println("**CLASIFICACIÓN**");
		liga.listarPuntos(equipo1,equipo2,equipo3,equipo4);
		
		System.out.println();
		liga.mostrarPichichi();
		
		System.out.println();
		liga.mostrarZamora();
						
	}
}

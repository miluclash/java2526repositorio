package tema3.rfef;

import java.util.Random;
public class LigaMichael {
	private EquipoFutbolMichael equipo1;
	private EquipoFutbolMichael equipo2;
	private EquipoFutbolMichael equipo3;
	private EquipoFutbolMichael equipo4;
	
	public LigaMichael(EquipoFutbolMichael equipo1, EquipoFutbolMichael equipo2, EquipoFutbolMichael equipo3,
			EquipoFutbolMichael equipo4) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.equipo3 = equipo3;
		this.equipo4 = equipo4;
	}

	public EquipoFutbolMichael getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(EquipoFutbolMichael equipo1) {
		this.equipo1 = equipo1;
	}

	public EquipoFutbolMichael getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(EquipoFutbolMichael equipo2) {
		this.equipo2 = equipo2;
	}

	public EquipoFutbolMichael getEquipo3() {
		return equipo3;
	}

	public void setEquipo3(EquipoFutbolMichael equipo3) {
		this.equipo3 = equipo3;
	}

	public EquipoFutbolMichael getEquipo4() {
		return equipo4;
	}

	public void setEquipo4(EquipoFutbolMichael equipo4) {
		this.equipo4 = equipo4;
	}
	
	public void simularPartido(EquipoFutbolMichael equipoA, EquipoFutbolMichael equipoB) {
		Random random=new Random();
		int golesA = random.nextInt(6);
		int golesB = random.nextInt(6);
		
		System.out.println(equipoA.getNombreEquipo()+" "+golesA+" - "+golesB+" "+equipoB.getNombreEquipo() );
		
		equipoA.getPorteroTitular().setGolesRecibidos(golesB);
	
		equipoA.getCentral1().setPenaltisCometidos(random.nextInt(20));
		equipoA.getCentral2().setPenaltisCometidos(random.nextInt(20));
		equipoA.getInteriorIzq().setPenaltisCometidos(random.nextInt(20));
		equipoA.getInteriorDcha().setPenaltisCometidos(random.nextInt(20));
		
		equipoA.getCentrocampista1().setNumAsistencias(random.nextInt(15));
		equipoA.getCentrocampista2().setNumAsistencias(random.nextInt(15));
		equipoA.getCentrocampista3().setNumAsistencias(random.nextInt(15));
		
		/*equipoA.getExtremoIzq().setGolesAnotados(random.nextInt(5));
		equipoA.getExtremoDcha().setGolesAnotados(random.nextInt(5));*/
		equipoA.getDelanteroCentro().setGolesAnotados(golesB);
/*-------------------------------------------------------------------------------------*/
		equipoB.getPorteroTitular().setGolesRecibidos(golesA);
		equipoB.getCentral1().setPenaltisCometidos(random.nextInt(20));
		equipoB.getCentral2().setPenaltisCometidos(random.nextInt(20));
		equipoB.getInteriorIzq().setPenaltisCometidos(random.nextInt(20));
		equipoB.getInteriorDcha().setPenaltisCometidos(random.nextInt(20));
		
		equipoB.getCentrocampista1().setNumAsistencias(random.nextInt(15));
		equipoB.getCentrocampista2().setNumAsistencias(random.nextInt(15));
		equipoB.getCentrocampista3().setNumAsistencias(random.nextInt(15));
		
		/*equipoB.getExtremoIzq().setGolesAnotados(random.nextInt(5));
		equipoB.getExtremoDcha().setGolesAnotados(random.nextInt(5));*/
		equipoB.getDelanteroCentro().setGolesAnotados(golesB);



		if(golesA>golesB) {
			equipoA.setPuntos(equipoA.getPuntos()+3);

		}else if(golesB>golesA) {
			equipoB.setPuntos(equipoB.getPuntos()+3);
		}else {
			equipoA.setPuntos(equipoA.getPuntos()+1);
			equipoB.setPuntos(equipoB.getPuntos()+1);
		}	
	}
	
	
	public void listarPuntos(EquipoFutbolMichael equipo1,EquipoFutbolMichael equipo2, EquipoFutbolMichael equipo3,EquipoFutbolMichael equipo4) {
		/*System.out.println(equipo1.getNombreEquipo()+" tiene: "+equipo1.getPuntos()+" puntos");
		System.out.println(equipo2.getNombreEquipo()+" tiene: "+equipo2.getPuntos()+" puntos");
		System.out.println(equipo3.getNombreEquipo()+" tiene: "+equipo3.getPuntos()+" puntos");
		System.out.println(equipo4.getNombreEquipo()+" tiene: "+equipo4.getPuntos()+" puntos");*/
		
		int p1 = equipo1.getPuntos();
	    int p2 = equipo2.getPuntos();
	    int p3 = equipo3.getPuntos();
	    int p4 = equipo4.getPuntos();
		
	    //uso -1 para poner que no se tenga en cuenta el equipo al volver a revisar la clasificacion
	    //Lo hacemos 4 veces para que lo haga para los 4 equipos
	    for (int i = 0; i < 4; i++) {
	        if (p1 >= p2 && p1 >= p3 && p1 >= p4) {
	            System.out.println((i + 1) + "º " + equipo1.getNombreEquipo() + ": " + p1 + " puntos");
	            p1 = -1;
	        } else if (p2 >= p1 && p2 >= p3 && p2 >= p4) {
	            System.out.println((i + 1) + "º " + equipo2.getNombreEquipo() + ": " + p2 + " puntos");
	            p2 = -1;
	        } else if (p3 >= p1 && p3 >= p2 && p3 >= p4) {
	            System.out.println((i + 1) + "º " + equipo3.getNombreEquipo() + ": " + p3 + " puntos");
	            p3 = -1;
	        } else {
	            System.out.println((i + 1) + "º " + equipo4.getNombreEquipo() + ": " + p4 + " puntos");
	            p4 = -1;
	        }
	    }
		    
		}

	public void mostrarPichichi() {
		/*-------MOSTRAR PICHICHI-----------------------------------*/
		int g1 = equipo1.getDelanteroCentro().getGolesAnotados();
		int g2 = equipo2.getDelanteroCentro().getGolesAnotados();
		int g3 = equipo3.getDelanteroCentro().getGolesAnotados();
		int g4 = equipo4.getDelanteroCentro().getGolesAnotados();
		
	        if (g1 >= g2 && g1 >= g3 && g1 >= g4) {
	            System.out.println("El PICHICHI DE LA JORNADA ES: " + equipo1.getDelanteroCentro() + " con " + g1 + " goles");
	            
	        } else if (g2 >= g1 && g2 >= g3 && g2 >= g4) {
	        	System.out.println("El PICHICHI DE LA JORNADA ES: " + equipo2.getDelanteroCentro() + " con " + g2 + " goles");
	        } else if (g3 >= g1 && g3 >= g2 && g3 >= g4) {
	        	System.out.println("El PICHICHI DE LA JORNADA ES: " + equipo3.getDelanteroCentro() + " con " + g3 + " goles");
	        } else {
	        	System.out.println("El PICHICHI DE LA JORNADA ES: " + equipo4.getDelanteroCentro() + " con " + g4 + " goles");
	        }
	}
		
	public void mostrarZamora() {
		/*-------MOSTRAR ZAMORA-----------------------------------*/
		int z1 = equipo1.getPorteroTitular().getGolesRecibidos();
		int z2 = equipo2.getPorteroTitular().getGolesRecibidos();
		int z3 = equipo3.getPorteroTitular().getGolesRecibidos();
		int z4 = equipo4.getPorteroTitular().getGolesRecibidos();

	        if (z1 <= z2 && z1 <= z3 && z1 <= z4) {
	            System.out.println("El ZAMORA DE LA JORNADA ES: " + equipo1.getPorteroTitular() + " con " + z1 + " goles encajados.");
	            
	        } else if (z2 <= z1 && z2 <= z3 && z2 <= z4) {
	        	System.out.println("El ZAMORA DE LA JORNADA ES: " + equipo2.getPorteroTitular() + " con " + z2 + " goles encajados.");
	        } else if (z3 <= z1 && z3 <= z2 && z3 <= z4) {
	        	System.out.println("El ZAMORA DE LA JORNADA ES: " + equipo3.getPorteroTitular() + " con " + z3 + " goles encajados.");
	        } else {
	        	System.out.println("El ZAMORA DE LA JORNADA ES: " + equipo4.getPorteroTitular() + " con " + z4 + " goles encajados.");
	        }
	}
	
	public String toString() {
		return " INFORMACIÓN COMPLETA DE LA LIGA 🏆\n" +
		           " Equipo 1:\n" + equipo1.toString() + "\n\n" +
		           " Equipo 2:\n" + equipo2.toString() + "\n\n" +
		           " Equipo 3:\n" + equipo3.toString() + "\n\n" +
		           " Equipo 4:\n" + equipo4.toString();	
		}
}

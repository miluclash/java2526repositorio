package tema3.rfef;

import java.time.LocalDate;
 
public class EquipoFutbolMichael {
	private String nombreEquipo;
	private String ciudad;
	private String nombreCampo;
	private LocalDate fechaFundacion;
	private EntrenadorMichael entrenador;
	private PorteroMichael porteroTitular;
	private DefensaMichael central1;
	private DefensaMichael central2;
	private DefensaMichael interiorIzq;
	private DefensaMichael interiorDcha;
	private CentrocampistaMichael centrocampista1;
	private CentrocampistaMichael centrocampista2;
	private CentrocampistaMichael centrocampista3;
	private DelanteroMichael extremoIzq;
	private DelanteroMichael extremoDcha;
	private DelanteroMichael delanteroCentro;
	private int puntos;
	
	public EquipoFutbolMichael(String nombreEquipo, String ciudad, String nombreCampo, LocalDate fechaFundacion,
			EntrenadorMichael entrenador, PorteroMichael porteroTitular, DefensaMichael central1,
			DefensaMichael central2, DefensaMichael interiorIzq, DefensaMichael interiorDcha,
			CentrocampistaMichael centrocampista1, CentrocampistaMichael centrocampista2,
			CentrocampistaMichael centrocampista3, DelanteroMichael extremoIzq, DelanteroMichael extremoDcha,
			DelanteroMichael delanteroCentro, int puntos) {
		
		this.nombreEquipo = nombreEquipo;
		this.ciudad = ciudad;
		this.nombreCampo = nombreCampo;
		this.fechaFundacion = fechaFundacion;
		this.entrenador = entrenador;
		this.porteroTitular = porteroTitular;
		this.central1 = central1;
		this.central2 = central2;
		this.interiorIzq = interiorIzq;
		this.interiorDcha = interiorDcha;
		this.centrocampista1 = centrocampista1;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.extremoIzq = extremoIzq;
		this.extremoDcha = extremoDcha;
		this.delanteroCentro = delanteroCentro;
		this.puntos = puntos;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombreCampo() {
		return nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public EntrenadorMichael getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(EntrenadorMichael entrenador) {
		this.entrenador = entrenador;
	}

	public PorteroMichael getPorteroTitular() {
		return porteroTitular;
	}

	public void setPorteroTitular(PorteroMichael porteroTitular) {
		this.porteroTitular = porteroTitular;
	}

	public DefensaMichael getCentral1() {
		return central1;
	}

	public void setCentral1(DefensaMichael central1) {
		this.central1 = central1;
	}

	public DefensaMichael getCentral2() {
		return central2;
	}

	public void setCentral2(DefensaMichael central2) {
		this.central2 = central2;
	}

	public DefensaMichael getInteriorIzq() {
		return interiorIzq;
	}

	public void setInteriorIzq(DefensaMichael interiorIzq) {
		this.interiorIzq = interiorIzq;
	}

	public DefensaMichael getInteriorDcha() {
		return interiorDcha;
	}

	public void setInteriorDcha(DefensaMichael interiorDcha) {
		this.interiorDcha = interiorDcha;
	}

	public CentrocampistaMichael getCentrocampista1() {
		return centrocampista1;
	}

	public void setCentrocampista1(CentrocampistaMichael centrocampista1) {
		this.centrocampista1 = centrocampista1;
	}

	public CentrocampistaMichael getCentrocampista2() {
		return centrocampista2;
	}

	public void setCentrocampista2(CentrocampistaMichael centrocampista2) {
		this.centrocampista2 = centrocampista2;
	}

	public CentrocampistaMichael getCentrocampista3() {
		return centrocampista3;
	}

	public void setCentrocampista3(CentrocampistaMichael centrocampista3) {
		this.centrocampista3 = centrocampista3;
	}

	public DelanteroMichael getExtremoIzq() {
		return extremoIzq;
	}

	public void setExtremoIzq(DelanteroMichael extremoIzq) {
		this.extremoIzq = extremoIzq;
	}

	public DelanteroMichael getExtremoDcha() {
		return extremoDcha;
	}

	public void setExtremoDcha(DelanteroMichael extremoDcha) {
		this.extremoDcha = extremoDcha;
	}

	public DelanteroMichael getDelanteroCentro() {
		return delanteroCentro;
	}

	public void setDelanteroCentro(DelanteroMichael delanteroCentro) {
		this.delanteroCentro = delanteroCentro;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public String toString() {
		 return "Equipo:\n"+
		 			" Nombre del Equipo='" + nombreEquipo + "'\n" +
			        " Ciudad='" + ciudad + "'\n" +
			        " Nombre del Campo='" + nombreCampo + "'\n" +
			        " Fecha de Fundacion='" + fechaFundacion + "'\n" +"\n"+
			        " Entrenador=" + entrenador + ",\n" +
			        " Portero Titular= " + porteroTitular + ",\n" +
			        " Central 1= " + central1 + ",\n" +
			        " Central 2= " + central2 + ",\n" +
			        " Lateral Izq= " + interiorIzq + ",\n" +
			        " Lateral Dcho= " + interiorDcha + ",\n" +
			        " Centrocampista 1= " + centrocampista1 + ",\n" +
			        " Centrocampista 2= " + centrocampista2 + ",\n" +
			        " Centrocampista 3= " + centrocampista3 + ",\n" +
			        " Extremo Izq= " + extremoIzq + ",\n" +
			        " Extremo Dcho= " + extremoDcha + ",\n" +
			        " Delantero Centro= " + delanteroCentro + ",\n" +
			        " Puntos del Equipo= " + puntos;
	}
}

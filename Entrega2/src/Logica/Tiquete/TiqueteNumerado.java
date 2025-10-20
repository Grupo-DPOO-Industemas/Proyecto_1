package Logica.Tiquete;

import Logica.Evento.Localidad;

public class TiqueteNumerado extends Tiquete {
	
	private int numeroAsiento;
	
	public TiqueteNumerado(String identificador, double precioBase, double cargoPorcentual, double cuotaAdicionalEmision, Localidad localidad, String fecha, String hora, String estado, int numeroAsiento) {
		super(identificador, precioBase, cargoPorcentual, cuotaAdicionalEmision, localidad, fecha, hora, estado);
		this.numeroAsiento = numeroAsiento;
	}
	
	@Override
	public double calcularPrecio() {
		return precioBase + (precioBase * cargoPorcentual) + cuotaAdicionalEmision;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}
	
	public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }	

}

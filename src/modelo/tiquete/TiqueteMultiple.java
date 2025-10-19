package modelo.tiquete;

import modelo.evento.Localidad;

public abstract class TiqueteMultiple extends Tiquete {
	
	protected int cantidadAccesos;
	
	public TiqueteMultiple(String identificador, double precioBase, double cargoPorcentual, double cuotaAdicionalEmision, Localidad localidad, String fecha, String hora, String estado, int cantidadAccesos) {
		super(identificador, precioBase, cargoPorcentual, cuotaAdicionalEmision, localidad, fecha, hora, estado);
		this.cantidadAccesos = cantidadAccesos;
	}
	

	public int getCantidadAccesos() {
		return cantidadAccesos;
	}


	public void setCantidadAccesos(int cantidadAccesos) {
		this.cantidadAccesos = cantidadAccesos;
	}
	
	
	@Override
	public abstract double calcularPrecio();

}

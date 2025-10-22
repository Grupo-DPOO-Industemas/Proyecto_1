package logica.tiquete;

import logica.evento.Evento;
import logica.evento.Localidad;

public class TiqueteBasico extends Tiquete{
	
	public TiqueteBasico(String identificador, double precioBase, double cargoPorcentual, double cuotaAdicionalEmision, Localidad localidad, Evento evento, String fecha, String hora, String estado) {
		super(identificador, precioBase, cargoPorcentual, cuotaAdicionalEmision, localidad, evento, fecha, hora, estado);
	}
	

	@Override
	public double calcularPrecio() {
		return precioBase + (precioBase * cargoPorcentual) + cuotaAdicionalEmision;
	}
	

}

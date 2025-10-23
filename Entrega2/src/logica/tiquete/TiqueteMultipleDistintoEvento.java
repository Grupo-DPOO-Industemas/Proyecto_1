package logica.tiquete;

import logica.evento.Evento;
import logica.evento.Localidad;

public class TiqueteMultipleDistintoEvento extends TiqueteMultiple {

	public TiqueteMultipleDistintoEvento(String identificador, double precioBase, double cargoPorcentual, double cuotaAdicionalEmision, Localidad localidad, Evento evento,
			String fecha, String hora, String estado, int cantidadAccesos) {
		super(identificador, precioBase, cargoPorcentual, cuotaAdicionalEmision, localidad, evento, fecha, hora, estado, cantidadAccesos);
	}

	@Override
	public double calcularPrecioFinal() {
		double total = cantidadAccesos * (precioBase + (precioBase * cargoPorcentual) + cuotaAdicionalEmision);
        return total * 1.10;
	}
	

}

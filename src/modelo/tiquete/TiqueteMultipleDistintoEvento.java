package modelo.tiquete;

import modelo.evento.Localidad;

public class TiqueteMultipleDistintoEvento extends TiqueteMultiple {

	public TiqueteMultipleDistintoEvento(String identificador, double precioBase, double cargoPorcentual,
			double cuotaAdicionalEmision, Localidad localidad, String fecha, String hora, String estado,
			int cantidadAccesos) {
		super(identificador, precioBase, cargoPorcentual, cuotaAdicionalEmision, localidad, fecha, hora, estado,
				cantidadAccesos);
	}

	@Override
	public double calcularPrecio() {
		double total = cantidadAccesos * (precioBase + (precioBase * cargoPorcentual) + cuotaAdicionalEmision);
        return total * 1.10;
	}
	

}

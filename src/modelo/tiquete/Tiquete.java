package modelo.tiquete;

import modelo.evento.Localidad;

public abstract class Tiquete {
	protected String identificador;
	protected double precioBase;
    protected double cargoPorcentual;
    protected double cuotaAdicionalEmision;
    protected Localidad localidad;
    protected String fecha;
    protected String hora;
    protected String estado;
	
    public Tiquete(String identificador, double precioBase, double cargoPorcentual,
        double cuotaAdicionalEmision, Localidad localidad, String fecha, String hora, String estado) {
    	this.identificador = identificador;
    	this.precioBase = precioBase;
    	this.cargoPorcentual = cargoPorcentual;
    	this.cuotaAdicionalEmision = cuotaAdicionalEmision;
    	this.localidad = localidad;
    	this.fecha = fecha;
    	this.hora = hora;
    	this.estado = estado;
    }

	public String getIdentificador() {
		return identificador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getCargoPorcentual() {
		return cargoPorcentual;
	}

	public double getCuotaAdicionalEmision() {
		return cuotaAdicionalEmision;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public String getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public abstract double calcularPrecio();
}

package logica.evento;

public class Localidad {
	private String nombre;
    private double precioBase;
    private int tiquetesDisponibles;
    
    public Localidad(String nombre, double precioBase, int cantidadTiquetesDisponibles) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tiquetesDisponibles = cantidadTiquetesDisponibles;
    }

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setTiquetesDisponibles(int tiquetesDisponibles) {
		this.tiquetesDisponibles = tiquetesDisponibles;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public int getTiquetesDisponibles() {
		return tiquetesDisponibles;
	}
	
	public boolean venderTiquetes(int cantidad) {
        if (cantidad > 0 && cantidad <= tiquetesDisponibles) {
            tiquetesDisponibles -= cantidad;
            return true;
        }
        return false;
    }
	
	public void devolverTiquetes(int cantidad) {
        if (cantidad > 0) {
        	tiquetesDisponibles += cantidad;
        }
    }
	
	public String toString() {
        return nombre + " - Precio base: " + precioBase + " - Disponibles: " + tiquetesDisponibles;
    }
	
	
    
    

}

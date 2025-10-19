package logica.evento;
import java.util.ArrayList;

import logica.usuario.OrganizadorDeEventos;

public class Evento {
	private String nombre;
    private String fecha;
    private String hora;
    private String lugar;
    private OrganizadorDeEventos organizador;
    private ArrayList<Localidad> localidades;
    
    public Evento(String nombre, String fecha, String hora, String lugar, OrganizadorDeEventos organizador) {
        this.setNombre(nombre);
        this.setFecha(fecha);
        this.setHora(hora);
        this.setLugar(lugar);
        this.setOrganizador(organizador);
        this.setLocalidades(new ArrayList<>());
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public OrganizadorDeEventos getOrganizador() {
		return organizador;
	}

	public void setOrganizador(OrganizadorDeEventos organizador) {
		this.organizador = organizador;
	}

	public ArrayList<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(ArrayList<Localidad> localidades) {
		this.localidades = localidades;
	}
	
	public void agregarLocalidad(Localidad localidad) {
		if (localidad != null) {
			localidades.add(localidad);		
		}
	}
	
	public Localidad buscarLocalidad(String nombreLocalidad) {
        for (Localidad localidad : localidades) {
            if (localidad.getNombre().equalsIgnoreCase(nombreLocalidad)) {
                return localidad;
            }
        }
        return null;
    }
	
	@Override
    public String toString() {
        return "Evento: " + nombre + " -> " + fecha + " -> " + hora + " -> " + lugar;
    }
}

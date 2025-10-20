package logica.usuario;

import java.util.ArrayList;
import java.util.List;
import logica.tiquete.Tiquete;

public class Cliente extends UsuarioConSaldo {

    private List<Tiquete> tiquetesComprados;

    public Cliente(String nombreUsuario, String contrasena, String nombreCompleto, double saldoInicial) {
        super(nombreUsuario, contrasena, nombreCompleto, saldoInicial);
        this.tiquetesComprados = new ArrayList<>();
    }

    public List<Tiquete> getTiquetesComprados() {
        return tiquetesComprados;
    }

    public void agregarTiquete(Tiquete tiquete) {
        if (tiquete != null) {
            tiquetesComprados.add(tiquete);
            tiquete.setDueno(this);
        }
    }

    public boolean comprarTiquete(Tiquete tiquete) {
        if (tiquete == null)
            throw new IllegalArgumentException("El tiquete no puede ser nulo.");

        double precio = tiquete.getPrecioFinal();

        if (precio > getSaldo()) {
            System.out.println("Saldo insuficiente para comprar el tiquete.");
            return false;
        }

        if (tiquete.isVendido()) {
            System.out.println("El tiquete ya fue vendido.");
            return false;
        }

        descontarSaldo(precio);
        tiquete.marcarComoVendido(this);
        tiquetesComprados.add(tiquete);
        return true;
    }

    public boolean solicitarReembolso(Tiquete tiquete) {
        if (tiquete == null || !tiquetesComprados.contains(tiquete)) {
            System.out.println("El tiquete no pertenece al cliente.");
            return false;
        }

        // marcamos el rembolso, no se ejecuta 
        tiquete.setReembolsoPendiente(true);
        return true;
    }

    public boolean transferirTiquete(Tiquete tiquete, Cliente nuevoDueno) {
        if (tiquete == null || nuevoDueno == null)
            return false;
        if (!tiquetesComprados.contains(tiquete))
            return false;

        tiquetesComprados.remove(tiquete);
        nuevoDueno.agregarTiquete(tiquete);
        tiquete.setDueno(nuevoDueno);
        return true;
    }

    public void mostrarTiquetes() {
        System.out.println("Tiquetes de " + getNombreCompleto() + ":");
        for (Tiquete t : tiquetesComprados) {
            System.out.println(" - " + t);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombreCompleto() + '\'' +
                ", saldo=" + getSaldo() +
                ", tiquetesComprados=" + tiquetesComprados.size() +
                '}';
    }
}

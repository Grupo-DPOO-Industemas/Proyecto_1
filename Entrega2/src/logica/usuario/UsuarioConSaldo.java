package logica.usuario;

public abstract class UsuarioConSaldo extends Usuario {

    protected double saldo;

    public UsuarioConSaldo(String nombreUsuario, String contrasena, String nombreCompleto, double saldoInicial) {
        super(nombreUsuario, contrasena, nombreCompleto);
        if (saldoInicial < 0)
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void recargarSaldo(double monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("El monto de recarga debe ser positivo.");
        saldo += monto;
    }

    public void descontarSaldo(double monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("El monto de descuento debe ser positivo.");
        if (monto > saldo)
            throw new IllegalStateException("Saldo insuficiente.");
        saldo -= monto;
    }

    public void aumentarSaldo(double monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("El monto debe ser positivo.");
        saldo += monto;
    }

    public boolean tieneFondosSuficientes(double monto) {
        return saldo >= monto;
    }

    @Override
    public String toString() {
        return "UsuarioConSaldo{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

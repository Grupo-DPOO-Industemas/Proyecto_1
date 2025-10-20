package Logica.Usuario;

public abstract class UsuarioConSaldo extends Usuario {
	private double saldo;

	public UsuarioConSaldo(String login, String password) {
		super(login, password);
		this.setSaldo(0.0);
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void agregarSaldo(double monto) {
		if (monto > 0) {
			saldo += monto;
		}
	}
	
	public boolean retirarSaldo(double monto) {
		if (monto > 0 && saldo>= monto) {
			saldo-= monto;
			return true;
		}
		 return false;
	}
	
	@Override
	public String toString() {
		return getTipoUsuario() + ":" + getLogin() + " -> Saldo: " + saldo;
	}
}

package Logica.Usuario;

public class Cliente extends UsuarioConSaldo {
	
	public Cliente(String login, String password) {
		super(login,password);
	}

	@Override
	public String getTipoUsuario() {
		return "Cliente";
	}
	
	public boolean comprarTiquete(double valorTiquete) {
		if (valorTiquete <= 0) {
			return false;
		}
		return retirarSaldo(valorTiquete);
	}
	
	@Override
    public String toString() {
        return getTipoUsuario() + ":" + getLogin() + " -> Saldo: " + getSaldo();
    }
	

		
}



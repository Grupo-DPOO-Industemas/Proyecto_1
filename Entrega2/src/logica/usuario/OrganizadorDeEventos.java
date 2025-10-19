package logica.usuario;

public class OrganizadorDeEventos extends UsuarioConSaldo{
	
	public OrganizadorDeEventos(String login, String password) {
		super(login, password);
	}

	@Override
	public String getTipoUsuario() {
		return "OrganizadorDeEventos";
	}
	
	@Override
    public String toString() {
        return getTipoUsuario() + ":" + getLogin() + " -> Saldo: " + getSaldo();
    }

}

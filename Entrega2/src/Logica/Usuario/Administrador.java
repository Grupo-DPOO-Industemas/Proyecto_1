package Logica.Usuario;

public class Administrador extends Usuario {
	
	public Administrador(String login, String password) {
		super(login, password);
	}

	@Override
	public String getTipoUsuario() {
		return "Administrador";
	}
	
	public String toString() {
        return getTipoUsuario() + ":" + getLogin();
    }
	
	
	

}

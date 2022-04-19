package UD8.Ejercicio2;

public class Password {

	protected int longitud;
	protected String password;

	//CONSTRUCTOR POR DEFECTO Y CON PARÁMETRO LONGITUD
	
	public Password() {
		this.longitud = 8;
		this.password = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.password = "";
	}
	
	public String getPasswordRandom() {
		return this.password;
	}
	
	//MÉTODO QUE VERIFICA SI LA LONGITUD ES MENOR O NO A 8
	public boolean passwordGenerate() {
		if(this.longitud < 8) {
			return false;
		}
		return true;
	}
	
	//MÉTODO QUE GENERA LA CONTRASEÑA
	public String createPassword() {
		if(passwordGenerate()) {
			this.password = "1233015109328";
		} else {
			this.password = "La contraseña debe contener al menos ocho caracteres";
		}
		return password;
	}
}


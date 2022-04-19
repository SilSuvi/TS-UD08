package UD8.Ejercicio2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		start();
	}

	public static void start() {
		String respuesta = JOptionPane.showInputDialog("¿Desea crear una nueva contraseña? Diga si o no");
		respuesta = respuesta.toLowerCase().trim();
		boolean continuar = false;
		
		if(respuesta.equals("si") || respuesta.equals("sí")) {
			continuar = true;
			do {
				String longi = JOptionPane.showInputDialog("Indique la longitud que desea ");
				int longitud = Integer.parseInt(longi);
				Password password = new Password(longitud);
				JOptionPane.showConfirmDialog(null, "La nueva contraseña creada es " + password.createPassword());
				respuesta = JOptionPane.showInputDialog("¿Desea crear una nueva contraseña? Diga si o no");
			}while(continuar);
		} else {
			JOptionPane.showMessageDialog(null, "Cerrando el programa...");
		}
	}

}

package UD8.Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		start();
	}

	public static void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Desea hacer la b�squeda de un electrodomestico?\nDiga si para continuar y no para cerrar el programa");
		String eleccion = scanner.nextLine();
		int bucle;
		
		eleccion = eleccion.toLowerCase().trim();
		if (eleccion.equals("si") || eleccion.equals("s�")) {
			do {
				System.out.println(
						"Indique los rasgos del electr�mestico \n�De qu� color? Disponible en blanco, negro, rojo, azul y gris");
				String color = scanner.next().toLowerCase();
				System.out.println("\n�De qu� consumo? (A, B, C, D, E, F)");
				String consumo = scanner.next().toUpperCase();
				char consumoChar = consumo.charAt(0);// CONVERSION DE STRING A CHAR
				System.out.println("\n�Cu�nto peso?");
				int peso = scanner.nextInt();
				System.out.println("\n�De qu� precio?");
				int precio = scanner.nextInt();

				Electrodomestico electrodomestico = new Electrodomestico(color, consumoChar, peso, precio);
				System.out.println(electrodomestico.toString());
				System.out.println(
						"�Desea hacer una nueva b�squeda? \n(1) Para continuar; (2) para cerrar");
				bucle = scanner.nextInt();
			} while (bucle == 1);
			System.out.println("Gracias y hasta otra");
		} else {
			System.out.println("Gracias y hasta otra");
		}

		scanner.close();
	}
}

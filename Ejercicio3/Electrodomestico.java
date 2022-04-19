package UD8.Ejercicio3;

public class Electrodomestico {

	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	

	//CONSTRUCTORES
	
	public Electrodomestico() {
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.precioBase = 100;
		this.peso = 5;
	}
	
	public Electrodomestico(int precio, int peso) {
		this.precioBase = precio;
		this.peso = peso;
	}
	
	public Electrodomestico(String color, char consumo, int precio, int peso) {
		this.color = color;
		this.consumoEnergetico = consumo;
		this.precioBase = precio;
		this.peso = peso;
	}
	
	//VERIFICACIÓN DEL COLOR
	
	public void verificaColor(String color) {
		color = color.toLowerCase().trim();
		switch("colour") {
			case "blanco":
				this.color = color;
				break;
			case "rojo":
				this.color = color;
				break;
			case "negro":
				this.color = color;
				break;
			case "azul":
				this.color = color;
				break;
			case "gris":
				this.color = color;
				break;
		}
		
	}
	
	//IMPRESIÓN POR PANTALLA
	
	public String toString() {
		return "La descripcion del electrodoméstico  es: \nColor = " + this.color +
				"\nConsumo = " + this.consumoEnergetico + "\nPrecio = " + this.precioBase +
				"\nPeso = " + this.peso;
	
	}
}

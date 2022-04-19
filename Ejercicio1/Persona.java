package UD8.Ejercicio1;

public class Persona {

		private String nombre;
		private String dni;
		private int edad;
		private String sexo = "H";
		private int peso;
		
		// CONSTRUCTOR POR DEFECTO Y CON PARÁMETROS
		
		public Persona() { 
			sexo = "H";
		}
	
		public Persona(String name, int age, String sex) {
			this.nombre = name;
			this.edad = age;
			this.sexo = sex;
		}
		
		public Persona(String name, String dni, int age, String sex, int weight) {
			this.nombre = name;
			this.dni = dni;
			this.edad = age;
			this.sexo = sex;
			this.peso = weight;
		}
		
	}

package mx.com.everis.tallerJava.test;

public class Persona {
	public Persona(String nombre, String apellido, int edad){
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	public Persona(String nombre, String apellido){
		setNombre(nombre);
		setApellido(apellido);
	}
	public Persona(){}
	
	private String nombre;
	private String  apellido;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}

	
	
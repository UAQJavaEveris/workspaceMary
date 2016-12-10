package mx.com.everis.tallerJava.library;

public class Library {
	public Library(){
		System.out.println("Harry");
		
	}
	Library(String nombre){
		this.setNombre(nombre);
	}
	public String nombre;
	public String direccion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
	
}

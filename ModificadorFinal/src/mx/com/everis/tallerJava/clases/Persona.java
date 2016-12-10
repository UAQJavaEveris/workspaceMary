package mx.com.everis.tallerJava.clases;

public class Persona {
	/**
	 * Reglas: modificador de no acceso final se aplica para clases, metodos y variables
	 * si una clase es final no tendra subclases o esto quiere decir que no se podra heredar
	 * si un metodo es final no podra ser sobre escrito
	 * si una variable es final no se puede asignada doble vez
	 */
	//Metodo
	
	public String getNombre(){
		return"";
	}
	//Solo se puede asignar una vez
	public static final String nombre ="Gustavo";
	persona (){
		nombre="Otro nombre";
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	/**
	 * El modificador static se aplica para clases , metodos y variables
	 */
}
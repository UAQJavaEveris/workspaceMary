package mx.com.everis.tallerJava.clases;
import mx.com.everis.tallerjava.interfaces;
public abstract class Persona extends Persona2 implements MiInterface{
	public Persona(){
		
	}
	//Metodo
	/**
	 * si una clase abstracta puede tener metodos abstractos y no abstractos
	 * una clase normal (concreta) solo puede tener metodos no abstractos
	 * @return
	 */
	//Metodo abstracto y no tiene cuerpo, si no esta dentro de una clase abstracta no puede tener metodos abstractos
	public abstract String getNombre();
	/**{
		return "";
	}
	*/
	//Metodo no abstracto por que tiene un cuerpo
	public void setNombre(){
		
	}
	public String getApellido(){
		return "";
	}
}

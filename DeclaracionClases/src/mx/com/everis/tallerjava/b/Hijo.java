/**
 * @author marie
 * @version 1.1
 */

package mx.com.everis.tallerjava.b;

import mx.com.everis.tallerjava.a.Persona;
import mx.com.everis.tallerjava.interfaces.Acciones;

public class Hijo extends Persona implements Acciones{
	public static String nombreHijo = "NombreA";
	/**
	 * Constructor
	 */
	public Hijo(){
		System.out.println("hijo");
	}
	
	public Hijo(String nombre){
		//setNombre(nombre);
		super(nombre,"nombre", "nombre2"); 
		//Super manda llamar  los constructores del padre 
	}
	/**
	 * Methods that not return a parameter run
	 */
	public void correr(){
		System.out.println("Correr -" + getNombre());
	}
	public void beber(){
		System.out.println("beber -" + getNombre());	
		}
	public void hablar(){
		System.out.println("hablar -" + getNombre());
}

}

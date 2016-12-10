package mx.com.everis.tallerJava.book;

import mx.com.everis.tallerJava.library.Library;

public class Book extends Library{
	public static String book = "HarryPotter";
	/**
	 * Constructor
	 */
	public Book(){
		System.out.println("Harry");
	}
	
	public Book(String nombre){
		setNombre(nombre);
		//super(nombre,"nombre", "nombre2"); 
		//Super manda llamar  los constructores del padre 
	}
	/**
	 * Methods that not return a parameter run
	 */
	public void leer(){
		System.out.println("Leer -" + getNombre());
	}
	public void comprar(){
		System.out.println("comprar -" + getNombre());	
		}
	public void rentar(){
		System.out.println("rentar -" + getNombre());
}
}

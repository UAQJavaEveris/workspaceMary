/**
 * @author marie
 * @version 1.1
 */
package mx.com.everis.tallerjava.test;
//import static mx.com.everis.tallerjava.b.Hijo.nombreHijo;//Elemento estatico 

import mx.com.everis.tallerjava.b.Hijo;
//import mx.com.everis.tallerjava.b.*;

//No es bueno utilizar los windcards por que manda llamar todas las clases del paquete
public class Test{
	public static void main (String panchito []){
		//mx.com.everis.tallerjava.b.Hijo h = new Hijo(panchito[0]);
		Hijo h = new Hijo(panchito[0]);
		//HijoA t = new HijoA();
		h.beber();
		System.out.println(panchito[1]);
	}
	public void getNombre(){
		System.out.println("");
	}
}
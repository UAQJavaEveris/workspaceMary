package mx.com.everis.tallerJava.testing;

import mx.com.everis.tallerJava.clases.Persona;
import mx.com.everis.tallerJava.genericos.MiGenerico;

public class TestGenerico {

	public static void main(String[] args) {
		MiGenerico<Persona> generico1 = new MiGenerico<Persona>(new Persona());
		generico1.print();
		MiGenerico<String> generico2 = new MiGenerico<String>("Mary");
		generico2.print();
		MiGenerico<Float> generico3 = new MiGenerico<Float>(10.5f);
		generico3.print();
		

	}

}

package mx.com.everis.tallerJava.Testing;

import mx.com.everis.tallerJava.clases.Persona;

public class Testing extends Persona{
	public static void main (String[] args){
		Persona pA = new Persona();
		System.out.println(pA.nombre);
		pA.nombre ="Mary";
		Persona pB = new Persona();
		System.out.println(pB.nombre);
		
	}
	public String getNombre(){
		return super.getNombre();
	}

}

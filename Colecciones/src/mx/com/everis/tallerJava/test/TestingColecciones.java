package mx.com.everis.tallerJava.test;

import java.util.ArrayList;
import java.util.List;

public class TestingColecciones {

	public static void main(String[] args) {
		//Se usan los genericos para poder definir de que tipo de dato se usara
		ArrayList<String> nombres = new ArrayList();
		//Click derecho y refactor para renombrar nombres a todos los nombres dentro de una clase
		nombres.add("Mary");
		nombres.add("Alex");
		nombres.add("Marco");	
		
		for(String a:nombres){
			System.out.println(a);
		}
		//Solo se utiliza la interfaz
		List<String> apellidos = new ArrayList<String>();
		
		apellidos.add("Rangel");
		apellidos.add("Piña");
		
		System.out.println("Numero de apellidos: "+apellidos.size());
		System.out.println(apellidos.get(1));
		
		//Busca el elemento dentro de la lista
		if(apellidos.contains("Rangel")){
			System.out.println("Contiene el apellido");
		}else{
			System.out.println("No contiene el apellido");
		}
		
		//Buscar mas sobre colecciones de java
	}

}

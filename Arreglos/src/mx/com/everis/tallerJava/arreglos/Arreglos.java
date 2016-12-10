package mx.com.everis.tallerJava.arreglos;

import mx.com.everis.tallerJava.test.Persona;

public class Arreglos {
	
	String nombre[]={"Hola","Mary","Marco","Alex"};
	int valores []= {1,2,3,4,};
	double decimales []={1.1,1.2,1.3,1.4};
	Double decimales2[]={new Double(1.3),new Double(2.4)};
	static Persona personas []={new Persona("Mariela","Ragnel",23),new Persona("Marco","Piña",25)};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<personas.length;i++){
			System.out.println("Nombre: "+personas[i].getNombre()+"Apellido:"+personas[i].getApellido()+"Edad:"+personas[i].getEdad());
		}
		
		for (Persona p : personas){
			System.out.println("Nombre"+p.getNombre()+"Apellido: "+p.getApellido()+"Edad: "+p.getEdad());
		}
	}

}

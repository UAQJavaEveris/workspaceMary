package mx.com.everis.tallerJava.test;

public class TestCadena {

	public static void main(String[] args) {
		String nombre="Mary";
		//Dice que iguales por que apunta al mismo espacio de memoria que la variable nombre 
		//String nombre="Mary";
		
		//Que no son iguales y si  son iguales por que apunta 
		//direcciones de memoria y no el contenido por eso se utiliza 
		//el equals para comparar los contenidos
		String nombre2= new String("Mary");
		
		if (nombre == nombre2){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		if (nombre.equals(nombre2)){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		String nombreCompleto = "Mary Marco Alex";
		String [] nombre1 = nombreCompleto.split("\\s");
		
		for(int i=0;i<nombre1.length;i++){
			System.out.println(nombre1[i]);
		}
		String name = nombreCompleto.trim();
		System.out.println(name);
		System.out.println("position"+ name.indexOf("m"));
		
		//Te lo convierte al string con el valueOf cualquier tipo de dato
		String valorboolean = name.valueOf(10.5d);
		System.out.println(valorboolean);
	}

}

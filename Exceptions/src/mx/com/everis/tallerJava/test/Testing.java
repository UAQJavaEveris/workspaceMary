package mx.com.everis.tallerJava.test;

import mx.com.everis.tallerJava.exceptions.MiException;

public class Testing {

	public static void main(String[] args) {//throws MiException {
		// TODO Auto-generated method stub
		int a = 1/0;
		//Comportamiento no esperado dentro de un programa
		int valorA=0;
		int valorB=1;
		
		if (valorA>=valorB){
			try {
				throw new MiException();
			} catch (MiException e) {
				System.out.println("Se genero un error");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				System.out.println("Siempre se ejecuta");
			}
		}else{
			System.out.println("Sin exceptcion");
		}

}
	public static void insertBD() throws MiException{
		
	}
	
}

package mx.com.everis.tallerJava.excepcionesArreglos;

import mx.com.everis.tallerJava.test.MiException1;

public class ExcepcionesArreglos {

	static int arreglo1[]={5,6,1,2,3,4,7};
	static int arreglo2[]={5,4,3,2,1};
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int sum=0;
		int sum1;
		int sum2;
		int suma=0;
		int valor=0;
		int valor1=0;
		sum1=arreglo1.length-1;
		sum2=arreglo2.length-1;
		if ((sum1>5)||(sum2>5)){
			try {
				throw new MiException1();
			} catch (MiException1 e) {
				System.out.println("Tu arreglo es mayor de lo permitido");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				System.out.println("Siempre se ejecuta");
			}
		}else{
			for(int i=0;i<=sum1;i++){	
				valor=arreglo1[i];
				if ((valor>9)||(valor<0)){
					try {
						throw new MiException1();
					} catch (MiException1 e) {
						System.out.println("Tu arreglo es mayor de lo permitido");
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						System.out.println("Siempre se ejecuta");
					}
				}else{
					sum=sum+arreglo1[i];
				}
				
			}
			System.out.println("La suma de arreglo 1 uno es: " + sum);
			
			for (int j=sum2;j>=0;j--){
				valor1=arreglo2[j];
				if((valor1>9)||(valor<0)){
					try {
						throw new MiException1();
					} catch (MiException1 e) {
						System.out.println("Tu arreglo es mayor de lo permitido");
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						System.out.println("Siempre se ejecuta");
					}
				}else{
					suma=suma+arreglo2[j];
				}
				
			}
			System.out.println("La suma de arreglo 2 uno es: " + suma);
		}
		
		
	}

}

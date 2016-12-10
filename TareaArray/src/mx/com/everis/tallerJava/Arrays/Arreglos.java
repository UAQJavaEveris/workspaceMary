package mx.com.everis.tallerJava.Arrays;

public class Arreglos {
	static int arreglo1[]={5,6,1,2,3,4};
	static int arreglo2[]={5,4,3,2,1};
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int sum=0;
		int sum1;
		int sum2;
		int suma=0;
		sum1=arreglo1.length-1;
		for(int i=0;i<=sum1;i++){
			
			sum=sum+arreglo1[i];
		}
		System.out.println("La suma de arreglo 1 uno es: " + sum);
		sum2=arreglo2.length-1;
		for (int j=sum2;j>=0;j--){
			suma=suma+arreglo2[j];
		}
		System.out.println("La suma de arreglo 2 uno es: " + suma);
	}
	
}

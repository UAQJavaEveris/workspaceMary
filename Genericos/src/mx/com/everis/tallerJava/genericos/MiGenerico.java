package mx.com.everis.tallerJava.genericos;

public class MiGenerico<E> {
	
	public E valor;
	public MiGenerico(E valor){
		this.valor=valor;
		System.out.println(valor);
	}
	public void print(){
		System.out.println("Valor: "+ this.valor);
	}

}

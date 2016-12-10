package mx.com.everis.tallerjava.a;
/**
 * 
 * @author marie
 * varsion 1.1
 */

//Persona = padre 
public class Persona {
	/**
	 * Constructor
	 */
	
	public Persona(){
		System.out.println("Padre");
	}
	//si este constructor se pone publico ya no haria referena a public Persona de arriba -public Persona(String nombre){
	Persona(String nombre){
		this.setNombre(nombre);
	}
	/**
	 * @varargs utiliza multiples varibles 
	 * @param nombre
	 */
	public Persona(String... nombre){
		this.setNombre(nombre[0]);
		this.setNombre(nombre[1]);
		
	}
	/**
	 * @param nombre
	 */
	private String nombre;
	/**
	 * @param apellido
	 */
	private String apellido;
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * 
	 */
	
	

}

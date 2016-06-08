package poo;

public class prueba {

	public static void main(String[] args) {
	//metodo main es publico, no devuelve nada y estatico (puede utilizarse sin objetos)
	//recibe un array llamado args
				
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Lis");
		Empleados trabajador3 = new Empleados("Sol");
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
	}

}
class Empleados{
	public Empleados (String nom){
		nombre=nom;
		seccion = "Administracion";
		Id = IdSiguiente;
		IdSiguiente ++;
		
		
	}
	public void cambiaSeccion(String seccion){
		this.seccion=seccion;
	}
	public String devuelveDatos(){
		return "El nombre es "+ nombre + " y la seccion es "+ seccion+ " y su Identificador es: "+ Id;
	}
	
	public static String dameIdSiguiente(){
		return "El Id siguiente es: " + IdSiguiente;//Metodo estatico no actua sobre objetos sino sobre la propia clase
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1; // variable de clase, se pone en curvisa
	//static implica que no todos los objetos tengan una copia de la variable y sea compartida por todos los objetos.
}
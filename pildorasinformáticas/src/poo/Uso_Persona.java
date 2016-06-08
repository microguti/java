package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] lasPersonas= new Persona[2];
		lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1]=new Alumno("Ana Lopez", "Biológicas");
		
		for(Persona p: lasPersonas){
			//El resultado va a ser diferente para componente del array dependiendo del objeto que se almacena
			//en el array personas.
			System.out.println(p.dameNombre() + p.dameDescripcion());
		}
	}

}
abstract class Persona{
	
	public Persona(String nom){
		nombre=nom;
	}
	public String dameNombre(){
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
}

class Empleado2 extends Persona{
	
	
	public Empleado2(String nom, double sue, int year, int mes, int dia){
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(year, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	
	public String dameDescripcion(){
		return "Este empleado tiene un Id= "+ Id +" con un sueldo= "+ sueldo;
	}
	
	
	
	/*Getter*/
	
	public double dameSueldo(){
		return sueldo;
	}
	
	public Date dameFecha(){
		return altaContrato;
	}
	/*Setter*/
	public void subeSueldo(double porcentaje){
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	/*Variables de clase*/
	
	private Date altaContrato; /*variable de tipo objeto,*/
	private double sueldo; 
	private int Id;
	private static int IdSiguiente; 
	//Indicamos que esta variable no pertenece a las instancias de la clase sino a la propia clase
	//Cada instancia de una misma clase no tendra una copia propia de esta variable
	
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car){
		
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion(){
		return "Este alumno esta estudiando la carrera de: "+carrera;
	}
	
	private String carrera;
}
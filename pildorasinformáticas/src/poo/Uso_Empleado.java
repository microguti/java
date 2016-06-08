package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Empleado empleado1 = new Empleado("Paco", 60000, 2012, 8, 12);
	Empleado empleado2 = new Empleado("Ana Lopez", 9500.675, 2006, 1, 20);
	Empleado empleado3 = new Empleado("Maria Lopez", 600.75, 2006, 1, 23);
	
	empleado1.subeSueldo(5);
	empleado2.subeSueldo(5);
	empleado3.subeSueldo(6);
	
	System.out.println("Nombre: "+ empleado1.dameNombre()+ " Sueldo: "+empleado1.dameSueldo()+ " Fecha de alta "+ empleado1.dameFecha());
	System.out.println("Nombre: "+ empleado1.dameNombre()+ " Sueldo: "+empleado2.dameSueldo()+ " Fecha de alta "+ empleado2.dameFecha());
	System.out.println("Nombre: "+ empleado1.dameNombre()+ " Sueldo: "+empleado3.dameSueldo()+ " Fecha de alta "+ empleado3.dameFecha());
	*/
	
	Jefatura jefe_RRHH=new Jefatura("Jose", 55000, 2006, 9, 25);	
	jefe_RRHH.estableceIncentivo(2000);
	
	
	//Principio de sustitucion. Un jefe es un empleado.
	Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
	
	//La clase empleado implementaba la clase comparable.
	//No se puede instanciar una interfaz pero si utilizar el principio sustitucion
	//Ejemplo es una "instancia" de tipo comparable, Empleado incluye la interfaz comparable
	Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 06,07);
		
	if(director_comercial instanceof Empleado){
		System.out.println("Es de tipo Jefatura");
	}
	if(ejemplo instanceof Comparable){
		System.out.println("Implementa la interfaz comparable");
	}
	
	
	
	Empleado[] misEmpleados = new Empleado[6];/*declaramos un array de una clase en concreto, en este caso de una clase*/
	misEmpleados[0] = new Empleado("Paco", 85000,1990,12,17);
	misEmpleados[1] = new Empleado("Luis", 95000,2000,5,1);
	misEmpleados[2] = new Empleado("Lolo", 80000,1990,6,17);
	misEmpleados[3] = new Empleado("Manuel");
	
	//Polimorfismo en accion. Principio de sustitucion.
	// Almacenamos dentro de esa posicion del array un empleado a pesar de que es una subclase
	misEmpleados[4] = jefe_RRHH; 							
	misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 2, 31);
	
	
	//Casting. Refundicion de objetos. Al elemento del array que contiene un empleado le convertimos en objeto Jefe. 
	Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
	jefa_Finanzas.estableceIncentivo(55000);
	jefa_Finanzas.establece_bonus(500);
	System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
	System.out.println("El Jefe: "+ jefa_Finanzas.dameNombre()+" tiene un bonus de: "+jefa_Finanzas.establece_bonus(500));
	System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de: "+misEmpleados[3].establece_bonus(200));
	
	/*for(int i=0; i<3; i++){
	misEmpleados[i].subeSueldo(5);
	System.out.println("Nombre "+ misEmpleados[i].dameNombre()+ " Sueldo: "+ misEmpleados[i].dameSueldo()+ "Fecha de Alta "+ 
	misEmpleados[i].dameFecha());
	}*/
	
	
	//Ordena un array por objetos segun lo hemos seleccionado.
	Arrays.sort(misEmpleados);
	
	for(Empleado e: misEmpleados){/*La variable e es de tipo empleado*/
		e.subeSueldo(5);
		System.out.println(e.dameNombre()+ " Sueldo: "+ e.dameSueldo()+ "Fecha de Alta "+ 
				e.dameFecha());
		//Enlazado dinamico, la maquina virtual de java sabe en tiempo de ejecucion que metodo usar, porque existen dos
		//metodos de empleado segun el objeto y el sabe cual utilizar.
	}	
	
}
}

/* Definimos otra clase, solo una puede ser publica, que corresponde con la main*/
/*Nos obligan a implementar la interfaz comparable, segun aparece en la API java, para utilizar Arrays.sort*/
class Empleado implements Comparable, Trabajadores{
	
	/*Constructor, al que le pasamos parametros*/
	/*Sobrecarga de constructores. 
	Se pueden tener varios constructores con el mismo nombre pero no pueden recibir el mismo numero de parametros*/
	
	public Empleado(String nom, double sue, int year, int mes, int dia){
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(year, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	
	public Empleado(String nom){
		this(nom, 30000, 2000, 1, 1);//En este caso this llama al otro constructor y pasarle los parametros
	}
	
	public double establece_bonus(double gratificacion){
		return Trabajadores.bonus_base+gratificacion;
	}
	
	/*Getter*/
	public String dameNombre(){
		
		return nombre+ " con Id: "+ Id;
	}
	
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
	private String nombre;
	private Date altaContrato; /*variable de tipo objeto,*/
	private double sueldo; 
	private int Id;
	private static int IdSiguiente; 
	//Indicamos que esta variable no pertenece a las instancias de la clase sino a la propia clase
	//Cada instancia de una misma clase no tendra una copia propia de esta variable
	
	//definimos el metodo compareTo para implementarlo porque asi aparece en la API Java
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado=(Empleado) miObjeto;
		if (this.sueldo<otroEmpleado.sueldo){
			return -1;
		}
		if (this.sueldo>otroEmpleado.sueldo){
			return 1;
		}
		return 0;
		
	}
	
}


//Creamos una clase Jefatura heredando de empleado.	
//Al implementar una clase debemos desarrollar sus metodos heredados
 
class Jefatura extends Empleado implements Jefes{
	
	public Jefatura (String nom, double sue, int year, int mes, int dia){
		super (nom, sue, year, mes, dia);
	}
	
	public String tomar_decisiones(String decision){
	return "Un miembro de la direccion ha tomado la decision de: "+ decision;	
	}
	
	public double establece_bonus(double gratificacion){
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void estableceIncentivo(double b){
		incentivo = b;
	}
	
	//Al existir dos metodos dameSueldo, sobreescribe este segundo al metodo padre.
	public double dameSueldo(){
		double sueldoJefe = super.dameSueldo()+incentivo;//Usamos super para utilizar el metodo de la clase padre
		return sueldoJefe;
	}
	
	private double incentivo;
}

final class Director extends Jefatura{//Con final ya no se podria heredar a partir de jefatura.
	
	public Director(String nom, double sue, int year, int mes, int dia){
		super (nom, sue, year, mes, dia);
	}
}

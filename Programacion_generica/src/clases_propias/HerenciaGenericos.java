package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		/*Un jefe es siempre un empleado pero no se maneja asi en clases genericas.
		Empleado Administrativa=new Empleado("Elena", 45, 15000);
		Jefe DirectoraComercial=new Jefe("ana", 27, 35000);
		Empleado nuevoEmpleado=DirectoraComercial;
		*/
		
		Pareja<Empleado> Administrativa=new Pareja<Empleado>();
		Pareja<Jefe> DirectoraComercial=new Pareja<Jefe>();
		/*No funciona de la forma habitual
		 *  Pareja<Empleado> nuevoEmpleado=DirectoraComercial;*/
		Pareja.imprimirTrabajador(Administrativa);
		
		/*No funciona a pesar de haber definido el metodo en la clase generica
		 * porque la herencia no funcion. Salvo que utilicemos el tipo comodin
		 */
		//Pareja.imprimirTrabajador(DirectoraComercial);
		 
		
		
	}

}

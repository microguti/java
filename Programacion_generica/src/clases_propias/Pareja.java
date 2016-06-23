package clases_propias;


//Entre corchetos angulados ponermos el parametro de tipo T
public class Pareja<T> {

	public Pareja(){
		primero=null;	
	}
	public void setPrimero(T nuevoValor){
		primero=nuevoValor;
	}
	
	/*Metodo que recibe un argumento generico de tipo Empleado, p
	y es que añadimos ? mas extends puede recibir un tipo empleado o cualquier subclase de tipo empleado*/
	public static void imprimirTrabajador(Pareja<? extends Empleado> p){
		Empleado primero=p.getPrimero();
		System.out.println(primero);
	}
	public T getPrimero(){
		return primero;
	}
	
	private T primero;
}

package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {

	public static void main(String[] args) {
		/*Empleado listaEmpleados[]=new Empleado[3];
		listaEmpleados[0]=new Empleado("Ana",45,2000);
		listaEmpleados[1]=new Empleado("Luis",53,2000);
		listaEmpleados[2]=new Empleado("Ana",11,2222);
		for(int i=0;i<listaEmpleados.length; i++){
			System.out.println(listaEmpleados[i].dameDatos());
			
		}
		*/
		
		ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();
		listaEmpleados.add(new Empleado("Ana",45,2000));
		listaEmpleados.add(new Empleado("Luis",11,2000));
		listaEmpleados.add(new Empleado("Ana m ",22,2000));
		listaEmpleados.set(0, new Empleado("Olga",25,31000));
		System.out.println(listaEmpleados.get(2).dameDatos());
		
		
		for(int i=0;i<listaEmpleados.size(); i++){
			Empleado e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}
			
		System.out.println("Tamaño del arraylist "+listaEmpleados.size());
		
		//Conversion del arraylist a un array normal
		Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleados);
		for(int i=0;i<arrayEmpleados.length; i++){
			System.out.println(arrayEmpleados[i].dameDatos());
			
		}
		
		Iterator <Empleado> mi_iterador=listaEmpleados.iterator();
		while(mi_iterador.hasNext()){
			System.out.println(mi_iterador.next().dameDatos());
		}
		
	}

}

class Empleado{
	public Empleado(String nombre, int años, double salario){
		this.name=nombre;
		this.edad=años;
		this.date=salario;
	}
	
	public String dameDatos(){
		return "El empleado se llama: "+ name +" tiene "+ edad + " de edad. y un salario de "+ date;
	}
	
	private String name;
	private int edad;
	private double date;
	
}
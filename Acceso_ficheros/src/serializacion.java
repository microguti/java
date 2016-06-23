import java.util.*;
import java.io.*;

public class serializacion {

	public static void main(String[] args) {
		
		Administrador jefe=new Administrador("Juan", 80000, 2005, 12, 15);
		jefe.setIncentivo(5000);
		
		
		Empleado[] personal=new Empleado[3];
		personal[0]=jefe;
		personal[1]=new Empleado("Ana", 25000, 2008,10, 1);
		personal[2]=new Empleado("Pepa", 75000, 2018,12, 17);
		
		try{
			ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("/Users/joseantoniosanchezmenor/Desktop/fichero.dat"));
			escribiendo_fichero.writeObject(personal);
			escribiendo_fichero.close();
			ObjectInputStream recuperado_fichero=new ObjectInputStream(new FileInputStream("/Users/joseantoniosanchezmenor/Desktop/fichero.dat"));
			Empleado[] personal_recuperado=(Empleado[]) recuperado_fichero.readObject();
			recuperado_fichero.close();
			for (Empleado e : personal_recuperado){
				System.out.println(e);
			}
		}catch(Exception e){
			
		}
	}
	
}

//El objeto que vamos a serializar es de tipo Empleado
class Empleado implements Serializable{
	public Empleado(String n, double s, int agno, int mes, int dia){
		nombre=n;
		sueldo=s;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		fechaContrato=calendario.getTime();
	}
	public String getNombre(){
		return nombre;
	}
	public double getSueldo(){
		return sueldo;
	}
	public void subirSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo +=aumento;
	}
	public String toString(){ //Pasa a texto lo que hace nuestra clase
		return "Nombre "+nombre+", sueldo "+sueldo+", fecha de contrato="+fechaContrato;
	}
	
	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
}

class Administrador extends Empleado{
	public Administrador(String n, double s, int agno, int mes, int dia){
		super(n, s, agno, mes, dia);
		incentivo=0;
	}
	public double getSueldo(){
		double sueldoBase=super.getSueldo();
		return sueldoBase+incentivo;
	}
	public void setIncentivo(double b){
		incentivo=b;
	}
	public String toString(){
		return super.toString()+" Incentivo="+incentivo;
	}
	
	private double incentivo;
	
}
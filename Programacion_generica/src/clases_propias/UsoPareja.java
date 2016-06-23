package clases_propias;

public class UsoPareja {

	public static void main(String[] args) {
		
		//instanciamos la clase Pareja
		Pareja<String> una=new Pareja<String>();
		una.setPrimero("666");
		System.out.println(una.getPrimero());
		
		Persona pers1=new Persona("Manolo");
		Pareja<Persona> manolo=new Pareja<Persona>();	
		manolo.setPrimero(pers1);
		System.out.println(manolo.getPrimero());

	}

}
class Persona{
	public Persona(String nombre){
		this.nombre=nombre;
	}
	
	//Con el metodo toString sobreescribimos lo que nos va a devolver en vez de la clase 
	//nos mostrara el parametro nombre;
	public String toString(){
		return nombre;
	}
	private String nombre;
}
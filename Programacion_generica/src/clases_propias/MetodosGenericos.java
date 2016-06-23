package clases_propias;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un array de strings
		String nombres[]={"jose","abad","pepe"};
		
		//recordar en metodos estaticos uitilizar el nombre del metodo en este caso al metodo le pasamos un string
		String elementos=MisMatrices.getElementos(nombres);
		System.out.println(elementos);
		System.out.println(MatrizMenor.getMenor(nombres));
		
		Empleado[] listaEmpleado={new Empleado("Ana", 45, 2000), new Empleado("Ana", 45, 2000),new Empleado("Ana", 45, 2000), new Empleado("Ana", 45, 2000)};
		System.out.println(MisMatrices.getElementos(listaEmpleado));
		//System.out.println(MatrizMenor.getMenor(listaEmpleado));
	}
	
	

}
class MisMatrices{
	
	//creando un metodo generico 
	public static <T> String getElementos(T[]a){
		return "El array tiene "+a.length+ " elementos.";
	}
}
class MatrizMenor{
	
	// tenemos que implementar la interfaz comparable para poder realizar la comparacion => compareTo
	
	public static <T extends Comparable> T getMenor(T[]a){
		if(a==null || a.length==0){
			return null;
		}
		
		T elementoMenor=a[0];
		for(int i=1;i<a.length;i++){
			if(elementoMenor.compareTo(a[i])>0){
				elementoMenor=a[i];
			}
		}
		return elementoMenor;
	}
}
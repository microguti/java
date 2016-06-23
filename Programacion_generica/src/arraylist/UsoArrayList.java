package arraylist;

import java.io.*;

public class UsoArrayList {

	public static void main(String[] args) {
		
		//Hemos generado una clase arrayList a la cual se le puede añadir cualquier tipo de dato
		ArrayList archivos=new ArrayList(5);
		archivos.add("Juan");
		archivos.add("luis");
		archivos.add("Juanito");
		archivos.add("JuanMol");		
		archivos.add(new File("gestion_pedidos.accdb"));
		
		//El problema es que tenemos que hacer un casting por cada tipo de datos
		String nombrePersona=(String)archivos.get(2);
		File nombrePersona1=(File)archivos.get(4);
		
		System.out.println(nombrePersona);
		System.out.println(nombrePersona1);
	}

}

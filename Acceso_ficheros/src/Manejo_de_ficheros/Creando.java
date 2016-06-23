package Manejo_de_ficheros;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Para crear un directorio
		 * File ruta=new File(File.separator + "Users"+File.separator+"joseantoniosanchezmenor"+File.separator+"Desktop"+File.separator+"Java"+File.separator+"newdirectory");		
		ruta.mkdir();
		*/
		File ruta=new File(File.separator + "Users"+File.separator+"joseantoniosanchezmenor"+File.separator+"Desktop"+File.separator+"Java"+File.separator+"newfile1.txt");		
		
	
		String archivo_destino=ruta.getAbsolutePath();
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Escribiendo accede_es=new Escribiendo();
		accede_es.escribir(archivo_destino);
		
	}
	
}

class Escribiendo{
	public void escribir(String ruta_archivo){
		String frase="Esto es un ejemplo de escribir en fichero";
		
		try {
			FileWriter escritura=new FileWriter(ruta_archivo);
			for(int i=0;i<frase.length(); i++){
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




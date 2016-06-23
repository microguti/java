package Manejo_de_ficheros;
import java.io.*;


public class ficheros_directorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		File archivo=new File("binJav");
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());*/
		
		//File ruta=new File("/Users/joseantoniosanchezmenor/Desktop/Java");
		//De la siguiente forma evitamos problemas con las barras de espacio
		File ruta=new File(File.separator + "Users"+File.separator+"joseantoniosanchezmenor"+File.separator+"Desktop"+File.separator+"Java");
	
		System.out.println(ruta.getAbsolutePath());
		String [] nombredearchivos=ruta.list();
		
		for (int i=0; i<nombredearchivos.length; i++){
			System.out.println(nombredearchivos[i]);
			File f=new File(ruta.getAbsoluteFile(), nombredearchivos[i]);
			if(f.isDirectory()){
				String [] archivos_subcarpeta=f.list();
				for (int j=0; j<archivos_subcarpeta.length; j++){
					System.out.println(archivos_subcarpeta[j]);
				}
			}
		}
	}

}

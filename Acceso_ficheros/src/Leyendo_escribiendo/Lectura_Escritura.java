package Leyendo_escribiendo;
import java.io.*;
public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int datos_entrada[]=new int[850754];
		
		try{
			FileInputStream archivo_lectura=new FileInputStream("/Users/joseantoniosanchezmenor/Desktop/img.jpg");
			boolean final_ar=false;
			while(!final_ar){
				int byte_entrada=archivo_lectura.read();
				if(byte_entrada!=-1)
					datos_entrada[contador]=byte_entrada;
				else
					final_ar=true;
				System.out.println("Contador"+contador+ "Dato"+datos_entrada[contador]);
				contador ++;
			}
			archivo_lectura.close();
		}catch (IOException e){
			System.out.println("No tenemos archivo");
		}
		System.out.println(contador);
		crea_fichero(datos_entrada);
	}
	
	static void crea_fichero(int datos_nuevo_fichero[]){
		try{
			FileOutputStream fichero_nuevo=new FileOutputStream("/Users/joseantoniosanchezmenor/Desktop/copia.jpg");
			for(int i=0;i<datos_nuevo_fichero.length; i++){
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			fichero_nuevo.close();
		}catch(IOException e){
			System.out.println("No se puede escribir el fichero");
		}
		}

}
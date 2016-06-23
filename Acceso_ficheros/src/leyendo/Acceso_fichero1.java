package leyendo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Acceso_fichero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_fichero1 accediendo=new Leer_fichero1();
		accediendo.lee1();

	}

}

class Leer_fichero1{
	public void lee1(){
		try {
			entrada = new FileReader("/Users/joseantoniosanchezmenor/Desktop/Fichero.txt");
			BufferedReader mibuffer=new BufferedReader(entrada);
			String linea="";
			while (linea !=null){
				linea=mibuffer.readLine();
				System.out.println(linea);
				}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra el fichero");
		}finally{
				
			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}
		private FileReader entrada;
}


//Cuando se abre un stream de datos hay que cerrarlo.
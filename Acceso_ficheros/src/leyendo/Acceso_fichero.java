package leyendo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Acceso_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_fichero accediendo=new Leer_fichero();
		accediendo.lee();

	}

}

class Leer_fichero{
	public void lee(){
		try {
			FileReader entrada=new FileReader("/Users/joseantoniosanchezmenor/Desktop/Fichero.txt");
			int c=entrada.read();
			while(c!=-1){
				c=entrada.read();
				char letra=(char)c;
				System.out.print(c);
				System.out.print(letra);
				System.out.println();
				
			}
			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra el fichero");
		}
	}
}


//Cuando se abre un stream de datos hay que cerrarlo.
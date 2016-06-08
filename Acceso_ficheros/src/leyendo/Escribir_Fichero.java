package leyendo;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {

	public static void main(String[] args) {
		Escribiendo escribe=new Escribiendo();
		escribe.escribir();

	}

}
class Escribiendo{
	public void escribir(){
		String frase="Esto es una prueba de escritura";
		try{
			FileWriter escritura=new FileWriter("/Users/joseantoniosanchezmenor/Desktop/texto_nuevo.txt");
			//para sobreescribir usamos el añadido true en la instancia anterior.
			for(int i=0;i<frase.length();i++){
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
package pildorasinformáticas;
import javax.swing.*;
public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		String edad=JOptionPane.showInputDialog("introduce tu edad");
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("hola tu nombre es: "+ Nombre + " Y tienes: "+ edad_usuario +" años");
	}

}

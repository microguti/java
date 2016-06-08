package poo;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class PruebaTemporizador {

	public static void main(String[] args){
		/*Instanciamos la clase DameLaHora*/
		DameLaHora oyente = new DameLaHora();
		//ActionListener oyente=new DameLaHora(); tambien podriamos utilizarlo

/*La definicion del constructor de Timer en la API es la siguiente Timer(int delay, ActionListener listener)
 * nosotros el objeto oyente no es un ActionListener sino que es de DameLaHora pero a su vez lo implementa,
 * porque una interfaz no se puede instanciar, si la clase que implementa la interfaz*/
		Timer mitemporizador = new Timer(5000, oyente);
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		System.exit(0);
	}
	
}

/*Definimos una clase que va a implementar la interfaz Timer
 *la interfaz ActionListener solo tiene un metodo, void actionPerformed(ActionEvent e)*/
class DameLaHora implements ActionListener{
	public void actionPerformed(ActionEvent e){		
		Date ahora=new Date();
		System.out.println("Te pongo la hora cada 5 sg: "+ahora);
		Toolkit.getDefaultToolkit().beep();
	}
}
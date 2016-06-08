package Mis_applets;

import javax.swing.*;

//Todos los applets heredan de JApplet

public class Hola_alumnos extends JApplet{
	public void init(){
		JLabel rotulo = new JLabel("Hola alumnos");
		add(rotulo);
	}
}

package graficos;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTeclas mimarco=new MarcoConTeclas();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTeclas extends JFrame{
	public MarcoConTeclas(){
		setVisible(true);
		setBounds(300,300,400,350);
		EventoDeTeclado tecla=new EventoDeTeclado();
		//Ponemos a nuestro objeto a la escucha
		addKeyListener(tecla);
	}
}

//Clase objeto oyente
class EventoDeTeclado implements KeyListener{

	public void keyTyped(KeyEvent e) {
	char letra=e.getKeyChar();
	System.out.println(letra);
	}


	public void keyPressed(KeyEvent e) {
		int codigo=e.getKeyCode();
		System.out.println(codigo);
		
		
		
	}


	public void keyReleased(KeyEvent e) {
		
		
	}
	
}
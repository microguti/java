package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco ventana= new miMarco();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class miMarco extends JFrame{
	
	public miMarco(){
		/*setSize(500,300);
		setLocation(500,300);
		Puede sustituirse por*/
		setBounds(500,300,250,250);
		//setResizable(false);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		//el campo maximized_both es estatico por eso necesitamos poner el nombre de la clase
		setTitle("Mi ventana");
	}
	
}
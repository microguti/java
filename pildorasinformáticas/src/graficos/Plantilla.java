package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Plantilla {

	public static void main(String[] args) {
		MarcoTexto1 mimarco=new MarcoTexto1();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto1 extends JFrame{
	public MarcoTexto1(){
		setBounds(600,300,600,350);
		LaminaTexto1 milamina=new LaminaTexto1();
		add(milamina);
		setVisible(true);
	}
}

class LaminaTexto1 extends JPanel{
	public LaminaTexto1(){
		
	}
}
